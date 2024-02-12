
public class AlarmeThead extends Thread {
    private int horasA;
    private int minutosA;
    private int ativaAlarme;
    RelogioThead relogioThead = new RelogioThead();
    public void setAtivaAlarme(int ativaAlarme) {
        this.ativaAlarme = ativaAlarme;
    }
    public void setHoras(int horasA) {
        this.horasA = horasA;
    }
    public void setMinutos(int minutosA) {
        this.minutosA = minutosA;
    }
    public AlarmeThead() {
        start();
    }
    public void run() {
        while (true) {
            if (ativaAlarme == 1) {
                verificarAlarme();
            }
            try {
                Thread.sleep(1000); // Aguarda um segundo antes de verificar novamente
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void verificarAlarme() {
        int horasAtual = relogioThead.getHoras();
        int minutosAtual = relogioThead.getMinutos();
        if (horasA == horasAtual && minutosA == minutosAtual) {
            System.out.println("Disparando alarme!");
            System.out.printf("%02d:%02d\n", horasA, minutosA);
            ativaAlarme = 0; // Desativar o alarme após disparar uma vez
        }
    }
}
