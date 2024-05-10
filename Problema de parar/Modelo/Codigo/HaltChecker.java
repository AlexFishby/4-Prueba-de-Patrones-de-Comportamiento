package Modelo.Codigo;

import Excepciones.InfiniteLoopException;
/**
 * Clase que verifica si un programa se detiene o no.
 */
public class HaltChecker {
    /**
     * Método que verifica si un programa se detiene o no.
     * @param program Programa que se va a verificar.
     * @return "para" si el programa se detiene, "nunca" en caso contrario.
     * @throws InfiniteLoopException Si el programa entra en un bucle infinito.
     */
    public String check(Program program) throws InfiniteLoopException {
        if (program.run()) {
            return "para";
        } else {
            return "nunca";
        }
    }
}