// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Video v[] = new Video[2];

       v[0] = new Video("Aula 1 de POO");
       v[1] = new Video("Aula 10 de CSS");
       //System.out.println(v[0].toString());


       Gafanhoto g[] = new Gafanhoto[2];
       g[0] = new Gafanhoto("Laio",24,"M","Laio123");
       g[1] = new Gafanhoto("Lala",18,"F","Lala123");
       //System.out.println(g[0].toString());

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[1]);
        System.out.println(vis[0].toString());
        vis[0].avaliar();

        vis[1] = new Visualizacao(g[0], v[0]);
        System.out.println(vis[1].toString());
        vis[1].avaliar(87.0f);


    }
}