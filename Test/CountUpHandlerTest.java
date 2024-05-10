import Modelo.Handler.Handler.CountUpHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Clase de prueba para CountUpHandler.
 */

public class CountUpHandlerTest {
    @Test
    void testConstructor() {
        CountUpHandler handler = new CountUpHandler();
        assertNotNull(handler);
    }

    @Test
    void testHandleProgram() {
        CountUpHandler handler = new CountUpHandler();
        assertDoesNotThrow(() -> handler.handleProgram("up"));
    }
}
