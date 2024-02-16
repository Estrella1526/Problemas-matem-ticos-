import java.util.Scanner;

public class Punto4 {
    
    // Función para calcular el gasto en arriendo
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.40; // 40% del sueldo
    }

    // Función para calcular el gasto en comida
    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15; // 15% del sueldo
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el sueldo de Pedro
        System.out.print("Ingrese el sueldo mensual de Pedro: ");
        double sueldo = scanner.nextDouble();

        // Calcular el gasto en arriendo
        double gastoArriendo = calcularGastoArriendo(sueldo);

        // Calcular el gasto en comida
        double gastoComida = calcularGastoComida(sueldo);

        // Calcular el dinero restante después de pagar el arriendo y la comida
        double dineroRestante = sueldo - gastoArriendo - gastoComida;

        // Mostrar los resultados
        System.out.println("Gasto en arriendo: $" + gastoArriendo);
        System.out.println("Gasto en comida: $" + gastoComida);
        System.out.println("Dinero restante: $" + dineroRestante);

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
