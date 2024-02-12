public class Livro implements Publicacao{
    private String titulo;
    private String Autor;
    private int totPag;
    private int pgAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        Autor = autor;
        this.totPag = totPag;
        this.pgAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" +
                " \n Titulo = '" + titulo + '\'' +
                " \n Autor = '" + Autor + '\'' +
                " \n Total de Pag = " + totPag +
                " \n Pg Atual = " + pgAtual +
                " \n Aberto = " + aberto +
                " \n Leitor = " + leitor.getNome()+"\n"+
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPgAtual() {
        return pgAtual;
    }

    public void setPgAtual(int pgAtual) {
        this.pgAtual = pgAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.pgAtual = p;
    }

    @Override
    public void avancarPag() {
        this.pgAtual++;
    }

    @Override
    public void voltarPag() {
        this.pgAtual--;
    }
}
