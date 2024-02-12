import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class RelogioThead extends Thread{ //Estendi a classe Thead.
    private int horas;
    private int minutos;
    private int segundos;
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public RelogioThead(){// Construtor que vai receber o nome da minha thread.
        start();
    }
    public void run(){ //Sobrescreve o metodo run
        for (horas = 0; horas < 24; horas++) {
            for (minutos = 0; minutos < 60; minutos++) {
                for (segundos = 0; segundos < 60; segundos++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public int getMinutos() {
        return minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    public int getHoras() {return horas;}
}

