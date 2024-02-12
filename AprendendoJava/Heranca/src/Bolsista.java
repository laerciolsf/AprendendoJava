public class Bolsista extends Aluno{
    private float bolsa;

    //Métodos
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+ this.nome);
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de Bolsista "+ this.nome);
    }

    //Getters and Setters
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
