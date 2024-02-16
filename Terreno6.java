import java.lang.Math;

public class Terreno6 {

    // Función para calcular el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Función para calcular la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    // Función para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return 0.5 * base * altura;
    }

    // Función para calcular el perímetro de un terreno
    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        double hipotenusa = calcularHipotenusa(ladoA, ladoB);
        return ladoA + ladoB + ladoC;
    }

    public static void main(String[] args) {
        // Importante: debes importar java.util.Scanner para leer la entrada del usuario
        // Crear un objeto Scanner para leer la entrada del usuario
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Pedir al usuario que ingrese las dimensiones de los lados del terreno
        System.out.print("Ingrese la longitud del lado A: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado B: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado C: ");
        double ladoC = scanner.nextDouble();

        // Calcular el área del terreno
        double areaTerreno = calcularAreaTriangulo(ladoA, ladoB) + calcularAreaRectangulo(ladoC, ladoA);

        // Calcular el perímetro del terreno
        double perimetroTerreno = calcularPerimetroTerreno(ladoA, ladoB, ladoC);

        // Mostrar los resultados
        System.out.println("El área del terreno es: " + areaTerreno);
        System.out.println("El perímetro del terreno es: " + perimetroTerreno);

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
