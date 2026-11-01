package co.edu.escuelaing.services;
public class MathServices {

    /**
     * Handler de la Lambda: recibe un número entero y devuelve su cuadrado.
     *
     * @param number valor recibido desde API Gateway
     * @return el número multiplicado por sí mismo
     */

    public static Integer square(Integer number) {
        int value = number;
        int result = value * value;
        return result;
    }
}
