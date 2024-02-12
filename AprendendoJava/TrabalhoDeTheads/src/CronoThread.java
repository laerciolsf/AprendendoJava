public class CronoThread extends Thread {
    private int horasC;
    private int minutosC;
    private int segundosC;
    private int op=1;
    public void setOp(int op){

        this.op = op;
    }
    public int getOp(){

        return op;
    }
    public CronoThread() {
        start();

    }

    public void run() {

        while (true) {//enquanto for menor que 1 o relogio roda!
            if(op==0)
                segundosC++;
            if (segundosC == 60) {
                segundosC = 0;
                minutosC++;
                if (minutosC == 60) {
                    minutosC = 0;
                    horasC++;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public int getChoras() {
        return horasC;
    }
    public int getCminutos() {
        return minutosC;
    }
    public int getCsegundos() {
        return segundosC;
    }
}
