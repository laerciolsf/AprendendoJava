public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;

    private boolean desligado;
    private  boolean tocando;

    //Construtor
    public ControleRemoto() {
        volume =50;
        ligado = false;
        tocando = false;
    }

    //Gets e Sets
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private boolean getDesligado() {
        return desligado;
    }

    private void setDesligado(boolean desligado) {
        this.desligado = desligado;
    }


    //Metodos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setDesligado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----Menu----");
        System.out.println("Esta ligado? "+this.getLigado());
        System.out.println("Está tocando? "+this.getTocando());
        System.out.print("Volume: "+ this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");

        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu... ");
    }

    @Override
    public void maisVol() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void deligarMudo() {
        if(this.getLigado() && this.getVolume()==0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando()) ){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && (this.getTocando()) ) {
            this.setTocando(false);
        }
    }
}
