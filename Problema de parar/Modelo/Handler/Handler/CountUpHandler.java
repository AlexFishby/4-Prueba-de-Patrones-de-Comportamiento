package Modelo.Handler.Handler;

import Excepciones.InfiniteLoopException;
import Modelo.Código.CountUpProgram;
import Modelo.Código.HaltChecker;
import Modelo.Código.Reverser;

/**
 * Clase que implementa la interfaz Program y proporciona un programa que cuenta hacia arriba.
 */

public class CountUpHandler extends ProgramHandler{
    /**
     * Maneja el programa proporcionado.
     *
     * @param programType El tipo de programa a manejar.
     * @throws InfiniteLoopException Si el programa entra en un bucle infinito.
     */
    @Override
    public void handleProgram(String programType) throws InfiniteLoopException {
        if (programType.equals("up")) {
            CountUpProgram countUpProgram = new CountUpProgram(1);
            HaltChecker haltChecker = new HaltChecker();
            Reverser reverser = new Reverser(countUpProgram);
            System.out.println("Resultado de HaltChecker para CountUpProgram: " + haltChecker.check(countUpProgram));
            System.out.println("Resultado de Reverser para CountUpProgram: " + reverser.reverse(countUpProgram));
        } else if (nextHandler != null) {
            nextHandler.handleProgram(programType);
        }
    }
}
