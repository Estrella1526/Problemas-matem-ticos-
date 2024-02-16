import java.lang.Math;

public class LongitudEscalera {
    
    public static double calcularLongitudEscalera(double x, double alpha) {
        // Convertir el ángulo alpha de grados a radianes
        double alphaRad = Math.toRadians(alpha);

        // Calcular la longitud de la escalera utilizando la función trigonométrica seno
        double y = x * Math.sin(alphaRad);

        return y;
    }

    public static void main(String[] args) {
        // Datos de entrada
        double alturaEscalera = 5.0; // Altura de la escalera en metros
        double angulo = 30.0; // Ángulo alpha en grados

        // Calcular la longitud de la escalera
        double longitudEscalera = calcularLongitudEscalera(alturaEscalera, angulo);

        // Mostrar el resultado
        System.out.println("La longitud de la escalera es: " + longitudEscalera + " metros.");
    }
}
