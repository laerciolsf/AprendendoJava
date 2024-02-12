// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        m.emitirSom();
        l.emitirSom();
        c.emitirSom();

        c.reagir("Olá");
        c.reagir("Vai apanhar");

        c.reagir(11,45);
        c.reagir(19, 00);

        c.reagir(true);
        c.reagir(false);

        c.reagir(2, 12.5f);
        c.reagir(17, 4.5ffe);
    }
}