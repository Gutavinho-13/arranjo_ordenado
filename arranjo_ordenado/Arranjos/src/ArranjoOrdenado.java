public class ArranjoOrdenado {

    private int[] arranjo;
    private int tamanho;
    private boolean crescente;

    public ArranjoOrdenado(int capacidade, boolean crescente) {
        arranjo = new int[capacidade];
        tamanho = 0;
        this.crescente = crescente;
    }

    public void inserir(int valor) {
        int i;
        if (crescente) {
            for (i = tamanho - 1; i >= 0 && arranjo[i] > valor; i--) {
                arranjo[i + 1] = arranjo[i];
            }
        } else {
            for (i = tamanho - 1; i >= 0 && arranjo[i] < valor; i--) {
                arranjo[i + 1] = arranjo[i];
            }
        }
        arranjo[i + 1] = valor;
        tamanho++;
    }

    public int buscar(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (arranjo[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public boolean excluir(int valor) {
        int index = buscar(valor);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < tamanho - 1; i++) {
            arranjo[i] = arranjo[i + 1];
        }
        tamanho--;
        return true;
    }

    public int getTamanho() {
        return tamanho;
    }
}

