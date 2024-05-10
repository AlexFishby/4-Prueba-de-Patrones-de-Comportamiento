package Vista;

import Modelo.Handler.Handler.ProgramHandler;
import Excepciones.InfiniteLoopException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vista extends JFrame {
    private ProgramHandler countUpHandler;

    public Vista() {
        // Configura la interfaz gráfica de usuario
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(new FlowLayout());

        // Crea los botones para los programas
        JButton btnCountUp = new JButton("CountUpProgram"); //de modelo.código.CountUpProgram
        JButton btnCountDown = new JButton("CountDownProgram"); //de modelo.código.CountDownProgram

        // Añade los botones a la interfaz gráfica de usuario
        getContentPane().add(btnCountUp);
        getContentPane().add(btnCountDown);

        // Configura los listeners de los botones
        btnCountUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    countUpHandler.handleProgram("up");
                } catch (InfiniteLoopException ex) {
                    ex.printStackTrace();
                }
            }
        });

        btnCountDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    countUpHandler.handleProgram("down");
                } catch (InfiniteLoopException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public void setCountUpHandler(ProgramHandler countUpHandler) {
        this.countUpHandler = countUpHandler;
    }
}