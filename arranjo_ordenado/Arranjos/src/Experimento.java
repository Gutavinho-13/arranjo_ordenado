import java.util.Random;

public class Experimento {

    static final int CAPACIDADE = 100000;
    static final int EXECUCOES = 100;

    public static long experimentoInsercao(boolean crescente, String tipo) {
        Random rand = new Random();
        ArranjoOrdenado arr = new ArranjoOrdenado(CAPACIDADE, crescente);
        int[] numeros = new int[CAPACIDADE];
        if (tipo.equals("crescente")) {
            for (int i = 0; i < CAPACIDADE; i++) {
                numeros[i] = i;
            }
        } else if (tipo.equals("decrescente")) {
            for (int i = 0; i < CAPACIDADE; i++) {
                numeros[i] = CAPACIDADE - i;
            }
        } else {
            for (int i = 0; i < CAPACIDADE; i++) {
                numeros[i] = rand.nextInt();
            }
        }

        long t1 = System.nanoTime();
        for (int n : numeros) {
            arr.inserir(n);
        }
        long t2 = System.nanoTime();
        return t2 - t1;
    }
}