public class ArranjoOrdenado {

    private int[] dados;
    private int tamanho;
    private boolean crescente;

    public ArranjoOrdenado(int capacidade, boolean crescente) {
        this.dados = new int[capacidade];
        this.tamanho = 0;
        this.crescente = crescente;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean cheio() {
        return tamanho == dados.length;
    }

    public boolean vazio() {
        return tamanho == 0;
    }

    public void inserir(int valor) {

        if (cheio()) {
            throw new RuntimeException("Arranjo cheio");
        }

        int i = tamanho - 1;

        if (crescente) {
            while (i >= 0 && dados[i] > valor) {
                dados[i + 1] = dados[i];
                i--;
            }
        } else {
            while (i >= 0 && dados[i] < valor) {
                dados[i + 1] = dados[i];
                i--;
            }
        }

        dados[i + 1] = valor;
        tamanho++;
    }

    public int buscar(int valor) {

        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;

            if (dados[meio] == valor)
                return meio;

            if (crescente) {

                if (dados[meio] < valor)
                    inicio = meio + 1;
                else
                    fim = meio - 1;

            } else {

                if (dados[meio] > valor)
                    inicio = meio + 1;
                else
                    fim = meio - 1;
            }
        }

        return -1;
    }

    public boolean remover(int valor) {

        int indice = buscar(valor);

        if (indice == -1)
            return false;

        for (int i = indice; i < tamanho - 1; i++) {
            dados[i] = dados[i + 1];
        }

        tamanho--;
        return true;
    }
}