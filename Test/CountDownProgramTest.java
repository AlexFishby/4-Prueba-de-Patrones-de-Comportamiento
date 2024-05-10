import Excepciones.InfiniteLoopException;
import Modelo.Codigo.CountDownProgram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para Modelo.Código.CountDownProgram.
 */
public class CountDownProgramTest {
    /**
     * Prueba el método run() de la clase Modelo.Código.CountDownProgram.
     * @throws InfiniteLoopException Si el programa entra en un bucle infinito.
     */
    @Test
    public void testRun() throws InfiniteLoopException {
        CountDownProgram countDownProgram = new CountDownProgram(10);
        assertTrue(countDownProgram.run());
    }
}
