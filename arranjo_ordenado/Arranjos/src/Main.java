public class Main {

    public static void main(String[] args) {
        long[] resultados = new long[100];
        for (int i = 0; i < 100; i++) {
            resultados[i] = Experimento.experimentoInsercao(true, "aleatorio");
        }
        double media = Estatistica.media(resultados);
        double desvio = Estatistica.desvioPadrao(resultados);
        System.out.println("Media: " + media);
        System.out.println("Desvio: " + desvio);
    }
}