import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class PapaiNoel {

    private static Random numeroAleatorio = new Random();

    private final Semaphore atencaoDoPapaiNoel;
    private final CyclicBarrier tresElfos;
    private final CyclicBarrier noveRenas;
    private final CyclicBarrier treno;
    private final CyclicBarrier problemaResolvido;

    private final List<Elfo> elfos;
    private final List<Rena> renas;

    private final static int numeroDeRenas = 9;
    private final static int elfosParaAcordar = 3;
    private final static int terceiroElfo = 0;

    private PapaiNoel () {
        atencaoDoPapaiNoel = new Semaphore(1, true);
        tresElfos = new CyclicBarrier(elfosParaAcordar, new Mensagem("> " + elfosParaAcordar + " elfos precisam de ajuda!"));
        noveRenas = new CyclicBarrier(numeroDeRenas);
        treno = new CyclicBarrier(numeroDeRenas, new Amarracao());
        problemaResolvido = new CyclicBarrier(elfosParaAcordar);

        elfos = new ArrayList<>();
        renas = new ArrayList<>();

        ArrayList<Thread> threads = new ArrayList<>();

        // Criando threads para renas
        for (int i = 0; i < numeroDeRenas; i++) {
            Rena rena = new Rena(i);
            renas.add(rena);
            threads.add(new Thread(rena));
        }

        System.out.println("<--------- INÍCIO --------->");
        for (Thread t : threads) {
            t.start();
        }

        // Cria um thread separado para gerar elfos indefinidamente
        Thread geradorDeElfos = new Thread(new GeradorDeElfos());
        geradorDeElfos.start();

        // Cria um thread separado para gerar renas em intervalos aleatórios
        Thread geradorDeRenas = new Thread(new GeradorDeRenas());
        geradorDeRenas.start();
    }

    // Classe para gerar elfos dinamicamente
    class GeradorDeElfos implements Runnable {
        @Override
        public void run() {
            int elfoId = 1;
            while (true) {
                // Cria um novo Elfo
                Elfo elfo = new Elfo(elfoId);
                elfos.add(elfo);
                Thread elfoThread = new Thread(elfo);
                elfoThread.start();
                elfoId++;
                try {
                    Thread.sleep(numeroAleatorio.nextInt(3000)); // Intervalo aleatório entre a criação de elfos
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    // Classe para gerar renas em intervalos aleatórios
    class GeradorDeRenas implements Runnable {
        @Override
        public void run() {
            int renaId = 1;
            while (true) {
                Rena rena = new Rena(renaId);
                renas.add(rena);
                Thread renaThread = new Thread(rena);
                renaThread.start();
                renaId++;
                try {
                    Thread.sleep(numeroAleatorio.nextInt(10000));  // Intervalo aleatório entre a criação de renas
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    // Classe para exibir mensagens
    static class Mensagem implements Runnable {
        String texto;
        Mensagem(String texto) {
            this.texto = texto;
        }
        @Override
        public void run() {
            System.out.println(texto);
        }
    }

    // Classe para gerenciar a amarração e desamarração das renas
    static class Amarracao implements Runnable {
        boolean trenoPreparado;
        Amarracao() {
            trenoPreparado = false;
        }
        @Override
        public void run() {
            trenoPreparado = !trenoPreparado;
            if (trenoPreparado) {
            } else {
                System.out.println(">>> Entrega realizada, renas desamarradas.\n    Férias das renas iniciadas!");
            }
        }
    }

    // Classe para representar os elfos
    class Elfo implements Runnable {

        int id;

        Elfo(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("> O Elfo " + id + " está com problemas...");

                    int elfo = tresElfos.await();
                    if (elfo == terceiroElfo) {
                        System.out.println("> Papai Noel está ajudando os elfos...");
                        atencaoDoPapaiNoel.acquire();
                    }

                    Thread.sleep(numeroAleatorio.nextInt(1000));
                    problemaResolvido.await();

                    if (elfo == terceiroElfo) {
                        atencaoDoPapaiNoel.release();
                    }

                    Thread.sleep(numeroAleatorio.nextInt(2500));
                }
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    // Classe para representar as renas
    class Rena implements Runnable {

        int id;

        Rena(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    int rena = noveRenas.await();

                    treno.await();
                    Thread.sleep(4000 + numeroAleatorio.nextInt(500));
                    System.out.println("> Rena " + id + " voltou de suas férias no Caribe.");

                    Thread.sleep(numeroAleatorio.nextInt(150));

                    rena = treno.await();
                    if (rena == 0) {
                        atencaoDoPapaiNoel.release();
                    }
                    Thread.sleep(numeroAleatorio.nextInt(10000));  // Tempo aleatório antes da próxima rena voltar
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new PapaiNoel();
    }
}