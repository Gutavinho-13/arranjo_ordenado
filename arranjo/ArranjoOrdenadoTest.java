import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArranjoOrdenadoTest {

    @Test
    void inserirFunciona() {

        ArranjoOrdenado arr = new ArranjoOrdenado(10, true);

        arr.inserir(3);
        arr.inserir(1);
        arr.inserir(2);

        assertEquals(3, arr.tamanho());
        assertTrue(arr.buscar(1) >= 0);
    }

    @Test
    void removerFunciona() {

        ArranjoOrdenado arr = new ArranjoOrdenado(10, true);

        arr.inserir(10);
        arr.inserir(20);
        arr.inserir(30);

        assertTrue(arr.remover(20));
        assertEquals(2, arr.tamanho());
    }

    @Test
    void buscarFunciona() {

        ArranjoOrdenado arr = new ArranjoOrdenado(10, true);

        arr.inserir(5);
        arr.inserir(15);
        arr.inserir(25);

        assertEquals(1, arr.buscar(15));
    }
}