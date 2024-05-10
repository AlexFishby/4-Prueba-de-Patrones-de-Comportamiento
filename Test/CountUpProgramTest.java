import Excepciones.InfiniteLoopException;
import Modelo.Código.CountUpProgram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para CountUpProgram.
 */
public class CountUpProgramTest {
    /**
     * Prueba el método run() de la clase CountUpProgram.
     * @throws InfiniteLoopException Si el programa entra en un bucle infinito.
     */
    @Test
    public void testRun() throws InfiniteLoopException {
        CountUpProgram countUpProgram = new CountUpProgram(1);
        assertTrue(countUpProgram.run());
    }
}