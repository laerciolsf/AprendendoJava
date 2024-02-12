public class Peixe extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substancia");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peice não faz som");
    }
    public void soltarBolha(){
        System.out.println("Soltar Bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
