package Modelo.Codigo;

/**
 * Clase que implementa la interfaz Program y proporciona un programa que cuenta hacia abajo.
 */
public class CountDownProgram implements Program{
    private int num;

    public CountDownProgram(int num) {
        this.num = num;
    }

    /**
     * Método que ejecuta el programa y lanza una excepción si entra en un bucle infinito.
     * @return Verdadero, ya que este programa no entra en un bucle infinito.
     */
    @Override
    public boolean run() {
        int num = 10;
        while (num != 0) {
            num--;
        }
        return true;
    }
}