package Modelo.Handler.Handler;

import Modelo.Código.CountDownProgram;
import Modelo.Código.Reverser;
import Modelo.Código.HaltChecker;

import Excepciones.InfiniteLoopException;

/**
 * Clase que implementa la interfaz Program y proporciona un programa que cuenta hacia abajo.
 */

public class CountDownHandler extends ProgramHandler{
@Override
public void handleProgram(String programType) throws InfiniteLoopException {
    /**
     * Maneja el programa proporcionado.
     *
     * @param program El tipo de programa a manejar.
            * @throws InfiniteLoopException Si el programa entra en un bucle infinito.
            */
    if (programType.equals("down")) {
        CountDownProgram countDownProgram = new CountDownProgram(10);
        HaltChecker haltChecker = new HaltChecker();
        Reverser reverser = new Reverser(countDownProgram);
        System.out.println("Resultado de HaltChecker para CountDownProgram: " + haltChecker.check(countDownProgram));
        System.out.println("Resultado de Reverser para CountDownProgram: " + reverser.reverse(countDownProgram));
    } else if (nextHandler != null) {
        nextHandler.handleProgram(programType);
    }
}
}
