// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 26, "M");
        p[1] = new Pessoa("Maria",25,"F");

        l[0] = new Livro("1984","George", 256, p[0]);
        l[1] = new Livro("Brasil Um Pais de Poucos","Fabio", 128, p[1]);
        l[2] = new Livro("Redes de Computadores","Gabriel", 1024, p[0]);

        System.out.println("\n ******* Detalhes ******* \n"+l[0].detalhes());
    }
}