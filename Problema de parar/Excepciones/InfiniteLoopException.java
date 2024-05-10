package Excepciones;

/**
 * Excepción personalizada que se lanza cuando un programa entra en un bucle infinito.
 */

public class InfiniteLoopException extends Exception {
    /**
     * Constructor de la clase Excepciones.InfiniteLoopException.
     * @param message Mensaje que describe la excepción.
     */
    public InfiniteLoopException(String message) {
        super(message);
    }
}
