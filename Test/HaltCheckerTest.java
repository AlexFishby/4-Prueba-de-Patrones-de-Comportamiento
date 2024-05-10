import Excepciones.InfiniteLoopException;
import Modelo.Codigo.CountDownProgram;
import Modelo.Codigo.HaltChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para Modelo.Código.HaltChecker.
 */
public class HaltCheckerTest {
    /**
     * Prueba el método check() de la clase Modelo.Código.HaltChecker.
     * @throws InfiniteLoopException Si el programa entra en un bucle infinito.
     */
    @Test
    public void testCheck() throws InfiniteLoopException {
        HaltChecker haltChecker = new HaltChecker();
        CountDownProgram countDownProgram = new CountDownProgram(10);
        assertEquals("para", haltChecker.check(countDownProgram));
    }
}