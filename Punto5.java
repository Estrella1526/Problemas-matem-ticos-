import java.lang.Math;

public class Punto5 {

    // Función para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // Función para calcular el área de la corona circular
    public static double calcularAreaCorona(double radioGrande, double radioPequeño) {
        // Utilizamos la función calcularAreaCirculo para obtener las áreas de los círculos
        double areaGrande = calcularAreaCirculo(radioGrande);
        double areaPequeño = calcularAreaCirculo(radioPequeño);

        // Restamos el área del círculo pequeño del área del círculo grande
        return areaGrande - areaPequeño;
    }

    public static void main(String[] args) {
        // Importante: debes importar java.util.Scanner para leer la entrada del usuario
        // Crear un objeto Scanner para leer la entrada del usuario
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Pedir al usuario que ingrese el radio grande (R) y el radio pequeño (r)
        System.out.print("Ingrese el radio grande (R): ");
        double radioGrande = scanner.nextDouble();

        System.out.print("Ingrese el radio pequeño (r): ");
        double radioPequeño = scanner.nextDouble();

        // Calcular el área de la corona circular
        double areaCorona = calcularAreaCorona(radioGrande, radioPequeño);

        // Mostrar el resultado
        System.out.println("El área de la corona circular es: " + areaCorona);

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
