import java.util.Random;

public class ExperimentoRemocao {

    static final int TAM = 100000;
    static final int EXEC = 100;

    public static void main(String[] args) {

        long[] tempos = new long[EXEC];
        Random rand = new Random();

        for (int e = 0; e < EXEC; e++) {

            ArranjoOrdenado arr = new ArranjoOrdenado(TAM, true);
            int[] numeros = new int[TAM];

            for (int i = 0; i < TAM; i++) {
                numeros[i] = rand.nextInt();
                arr.inserir(numeros[i]);
            }

            long t1 = System.nanoTime();

            for (int n : numeros) {
                arr.remover(n);
            }

            long t2 = System.nanoTime();

            tempos[e] = t2 - t1;
        }

        double media = Estatistica.media(tempos);
        double desvio = Estatistica.desvioPadrao(tempos);

        System.out.println("Remoção");
        System.out.println("Média: " + media);
        System.out.println("Desvio: " + desvio);
    }
}