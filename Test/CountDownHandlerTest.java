import Excepciones.InfiniteLoopException;
import Modelo.Handler.Handler.CountDownHandler;
import Modelo.Handler.Handler.ProgramHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Clase de prueba para CountDownHandler.

 */

public class CountDownHandlerTest {
    @Test
    public void testHandleProgram() {
        CountDownHandler countDownHandler = new CountDownHandler();
        countDownHandler.setNextHandler(new ProgramHandler() {
            @Override
            public void handleProgram(String programType) throws InfiniteLoopException {
                assertEquals("countdown", programType);
            }
        });
        try {
            countDownHandler.handleProgram("countdown");
        } catch (InfiniteLoopException e) {
            fail("InfiniteLoopException should not be thrown");
        }
    }
}
