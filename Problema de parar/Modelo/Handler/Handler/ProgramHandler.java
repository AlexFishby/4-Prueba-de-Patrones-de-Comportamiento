package Modelo.Handler.Handler;
import Excepciones.InfiniteLoopException;

public abstract class ProgramHandler {
    protected ProgramHandler nextHandler;
    /**
     * Establece el siguiente manejador en la cadena de responsabilidad.
     *
     * @param nextHandler El siguiente manejador en la cadena de responsabilidad.
     */
    public void setNextHandler(ProgramHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * Maneja el programa proporcionado. Si este manejador no puede manejar el programa,
     * pasa la solicitud al siguiente manejador en la cadena de responsabilidad.
     *
     * @param programType El tipo de programa a manejar.
     * @throws InfiniteLoopException Si el programa entra en un bucle infinito.
     */

    public abstract void handleProgram(String programType) throws InfiniteLoopException;
}
