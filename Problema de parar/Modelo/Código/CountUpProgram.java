package Modelo.Código;

/**
 * Clase que implementa la interfaz Program y proporciona un programa que cuenta hacia arriba.
 */
public class CountUpProgram implements Program{
    private int num;

    public CountUpProgram(int num) {
        this.num = num;
    }
    /**
     * Método que ejecuta el programa y lanza una excepción si entra en un bucle infinito.
     * @return Falso, ya que este programa entra en un bucle infinito.
     */
    @Override
    public boolean run() {
        int num = 1;
        while (num != 0) {
            num++;
        }
        return false;
    }
}