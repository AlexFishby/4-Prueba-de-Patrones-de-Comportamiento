import Excepciones.InfiniteLoopException;
import Modelo.Codigo.CountDownProgram;
import Modelo.Codigo.Reverser;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Clase de prueba para Modelo.Código.Reverser.
 */
public class ReverserTest {
    /**
     * Prueba el método run() de la clase Modelo.Código.Reverser.
     * @throws InfiniteLoopException Si el programa entra en un bucle infinito.
     */
    @Test
    public void testRun() throws InfiniteLoopException {
        CountDownProgram countDownProgram = new CountDownProgram(10);
        Reverser reverser = new Reverser(countDownProgram);
        assertTrue(reverser.run());
    }

    /**
     * Prueba el método reverse() de la clase Modelo.Código.Reverser.
     * @throws InfiniteLoopException Si el programa entra en un bucle infinito.
     */
    @Test
    public void testReverse() throws InfiniteLoopException {
        CountDownProgram countDownProgram = new CountDownProgram(10);
        Reverser reverser = new Reverser(countDownProgram);
        assertEquals("para", reverser.reverse(countDownProgram));
    }
}