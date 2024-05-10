package Controlador;

import Modelo.Handler.Handler.CountDownHandler;
import Modelo.Handler.Handler.CountUpHandler;
import Modelo.Handler.Handler.ProgramHandler;
import Modelo.Código.CountDownProgram;
import Modelo.Código.CountUpProgram;
import Modelo.Código.HaltChecker;
import Modelo.Código.Reverser;
import Modelo.Código.Program;
import Excepciones.InfiniteLoopException;
import Vista.Vista;


import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) throws InfiniteLoopException {


        Vista vista = new Vista();

        // Configura la cadena de responsabilidad en la interfaz gráfica de usuario
        ProgramHandler countUpHandler = new CountUpHandler();
        ProgramHandler countDownHandler = new CountDownHandler();
        countUpHandler.setNextHandler(countDownHandler);
        vista.setCountUpHandler(countUpHandler);

        // Muestra la interfaz gráfica de usuario
        vista.setVisible(true);

        // Interacción por teclado para el "usuario" que no utiliza la interfaz gráfica de usuario
        Scanner scanner = new Scanner(System.in);
        Program program = null;
        String programChoice;

        do {
            System.out.println("¿Quieres ejecutar CountDownProgram o CountUpProgram? (down/up)");
            programChoice = scanner.nextLine();

            if (programChoice.equals("down")) {
                program = new CountDownProgram(10);
            } else if (programChoice.equals("up")) {
                program = new CountUpProgram(1);
            } else {
                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        } while (program == null);

        String analysisChoice;
        do {
            System.out.println("¿Quieres analizarlo con HaltChecker solo o con HaltChecker y Reverser? (halt/reverser)");
            analysisChoice = scanner.nextLine();

            HaltChecker haltChecker = new HaltChecker();
            if (analysisChoice.equals("halt")) {
                System.out.println("Resultado de HaltChecker: " + haltChecker.check(program));
            } else if (analysisChoice.equals("reverser")) {
                Reverser reverser = new Reverser(program);
                try {
                    System.out.println("Resultado de HaltChecker: " + haltChecker.check(program));
                    System.out.println("Resultado de Reverser: " + haltChecker.check(reverser));
                } catch (InfiniteLoopException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        } while (!analysisChoice.equals("halt") && !analysisChoice.equals("reverser"));
    }
}