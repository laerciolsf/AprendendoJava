public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Som de Cachorro.");
    }

    public void reagir(String frase){
        if (frase.equals("Toma Comida")  || frase.equals("Olá")){
            System.out.println("Abanar o rabo e latir.");
        }else{
            System.out.println("Rosnar.");
        }
    }
    public void reagir(int hora, int minutos){
        if (hora < 12){
            System.out.println("Abanar o rabo.");
        }else if(hora >= 18){
            System.out.println("Ignorar.");
        }
    }
    public void reagir(boolean dono){

    }
    public void reagir(int idade, float peso){

    }
}
