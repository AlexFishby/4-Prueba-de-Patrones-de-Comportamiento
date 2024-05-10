package Modelo.Código;

import Excepciones.InfiniteLoopException;

/**
 * Clase que implementa la interfaz Modelo.Código.Program y proporciona una estrategia para revertir el comportamiento de un programa.
 */

public class Reverser implements Program {
    private Program program;
    /**
     * Constructor de la clase Modelo.Código.Reverser.
     * @param program Programa que se va a revertir.
     */

    public Reverser(Program program) {
        this.program = program;
    }

    /**
     * Método que ejecuta el programa y lanza una excepción si entra en un bucle infinito.
     * @return Verdadero si el programa no entra en un bucle infinito, falso en caso contrario.
     * @throws InfiniteLoopException Si el programa entra en un bucle infinito.
     */

    @Override
    public boolean run() throws InfiniteLoopException {
        HaltChecker haltChecker = new HaltChecker();
        String result = haltChecker.check(program);
        if (result.equals("para (bucle infinito)")) {
            throw new InfiniteLoopException("El programa entraría en un bucle infinito");
        } else {
            return true;
        }
    }

    /**
     * Método que revierte el comportamiento del programa.
     * @param program Programa que se va a revertir.
     * @return "nunca" si el programa entra en un bucle infinito, "para" en caso contrario.
     */

   public String reverse(Program program) {
        if (program == this) {
            try {
                return run() ? "nunca" : "para";
            } catch (InfiniteLoopException e) {
                return "nunca";
            }
        } else {
            try {
                return run() ? "para" : "nunca";
            } catch (InfiniteLoopException e) {
                return "para";
            }
        }
    }
}
