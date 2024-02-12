
public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Henry Baukt", "Brazil", 43, 1.75f, 68.5f, 11, 3, 1);
        l[1] = new Lutador("Élcio Padilha ", "Brazil", 53, 1.65f, 65.5f, 110, 100, 2);

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[0],l[1]);
        UFC01.lutar();
    }
}