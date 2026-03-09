import java.util.Random;

public class ExperimentoInsercao {

    static final int TAM = 100000;
    static final int EXEC = 100;

    public static void main(String[] args) {

        long[] tempos = new long[EXEC];
        Random rand = new Random();

        for (int e = 0; e < EXEC; e++) {

            ArranjoOrdenado arr = new ArranjoOrdenado(TAM, true);

            long t1 = System.nanoTime();

            for (int i = 0; i < TAM; i++) {
                arr.inserir(rand.nextInt());
            }

            long t2 = System.nanoTime();

            tempos[e] = t2 - t1;
        }

        double media = Estatistica.media(tempos);
        double desvio = Estatistica.desvioPadrao(tempos);

        System.out.println("Inserção Aleatória");
        System.out.println("Média: " + media);
        System.out.println("Desvio: " + desvio);
    }
}