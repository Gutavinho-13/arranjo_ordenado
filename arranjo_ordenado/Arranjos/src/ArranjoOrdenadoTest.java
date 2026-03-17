import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArranjoOrdenadoTest {
    @Test
    public void testeInsercao() {
        ArranjoOrdenado arr = new ArranjoOrdenado(10, true);
        arr.inserir(5);
        arr.inserir(3);
        arr.inserir(7);
        assertEquals(3, arr.getTamanho());
    }

    @Test
    public void testeExclusao() {
        ArranjoOrdenado arr = new ArranjoOrdenado(10, true);
        arr.inserir(5);
        arr.inserir(3);
        boolean removido = arr.excluir(3);
        assertTrue(removido);
    }
}