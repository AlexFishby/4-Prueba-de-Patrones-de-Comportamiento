package Modelo.Codigo;
import Excepciones.InfiniteLoopException;

/**
 * Interfaz para definir un programa.
 */
public interface Program {
    /**
     * Método que ejecuta el programa y lanza una excepción si entra en un bucle infinito.
     * @return Verdadero si el programa no entra en un bucle infinito, falso en caso contrario.
     * @throws InfiniteLoopException Si el programa entra en un bucle infinito.
     */
    boolean run() throws InfiniteLoopException;
}