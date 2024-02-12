import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RelogioThead rodarRelogio = new RelogioThead();
        AlarmeThead rodarAlarme = new AlarmeThead();
        CronoThread rodarCronometro = new CronoThread();

        while (true) {
            System.out.println("\n -Menu- ");
            System.out.println(" 1 Visualizar horário. ");
            System.out.println(" 2 Ajustar horário. ");
            System.out.println(" 3 Cronometro. ");
            System.out.println(" 4 Programar um alarme. ");
            System.out.println(" 5 Desligar o relogio. ");


            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    int horas = rodarRelogio.getHoras();
                    int minutos = rodarRelogio.getMinutos();
                    int segundos = rodarRelogio.getSegundos();
                    System.out.printf("\n\n\n\n\n\n\n\n\n\n\n Hora Atual: %02d:%02d:%02d \n", horas, minutos, segundos);
                    break;

                case 2:
                    //Ajuste de horario.
                    int res = 0;
                    System.out.println("Ajuste de hora: ");
                    System.out.println("Digite a Hora:");
                    res = scanner.nextInt();
                    rodarRelogio.setHoras(res);
                    System.out.println("Digite a Hora:");
                    res = scanner.nextInt();
                    rodarRelogio.setMinutos(res);
                    System.out.println("Digite a Hora:");
                    res = scanner.nextInt();
                    rodarRelogio.setSegundos(res);
                    break;
                case 3:
                    int croHora = rodarCronometro.getChoras();
                    int croMin = rodarCronometro.getCminutos();
                    int croSeg = rodarCronometro.getCsegundos();
                    System.out.println("Digite 1 para iniciar o cronômetro e 2 para pausar:");
                    int escolha = scanner.nextInt();
                    if (escolha == 1) {
                        //rodarCronometro.setOp(0);//inicia o cronometro.
                        System.out.println("Cronômetro iniciado.");
                        System.out.printf("Cronômetro: %02d:%02d:%02d\n", croHora, croMin, croSeg);
                        rodarCronometro.setOp(0);//inicia o cronometro.
                    } else if (escolha == 2) {
                        rodarCronometro.setOp(1);//Pausa o cronometro.
                        System.out.println("Cronômetro pausado.");
                        System.out.printf("Cronômetro: %02d:%02d:%02d\n", croHora, croMin, croSeg);
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 4:
                    //Alarme.
                    int alarme = 0;
                    System.out.println("Programar alarme: ");
                    System.out.println("Digite a Hora:");
                    alarme = scanner.nextInt();
                    rodarAlarme.setHoras(alarme);
                    System.out.println("Digite a Minutos:");
                    alarme = scanner.nextInt();
                    rodarAlarme.setMinutos(alarme);
                    rodarAlarme.setAtivaAlarme(1);
                    break;
                    case 5:
                        System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}