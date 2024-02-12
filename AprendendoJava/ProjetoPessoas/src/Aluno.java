public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String Caractere;

    //Métodos
    public void cancelarMatri(){
        System.out.println("Matricula sera cancelada! ");
    }

    //getters and setters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCaractere() {
        return Caractere;
    }

    public void setCaractere(String caractere) {
        Caractere = caractere;
    }
}
