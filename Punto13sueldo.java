import java.util.Scanner;

public class Punto13sueldo {
    
    // Función para calcular el aumento de sueldo
    public static double calcularAumento(double sueldoActual) {
        double aumento;
        if (sueldoActual <= 800000) {
            aumento = sueldoActual * 0.10; // 10% de aumento
        } else if (sueldoActual <= 1200000) {
            aumento = sueldoActual * 0.08; // 8% de aumento
        } else {
            aumento = sueldoActual * 0.05; // 5% de aumento
        }
        return aumento;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el sueldo actual del empleado
        System.out.print("Ingrese el sueldo actual del empleado: ");
        double sueldoActual = scanner.nextDouble();

        // Calcular el aumento de sueldo utilizando la función
        double aumento = calcularAumento(sueldoActual);

        // Calcular el nuevo salario sumando el aumento al sueldo actual
        double nuevoSalario = sueldoActual + aumento;

        // Mostrar el resultado
        System.out.println("El valor del aumento es: $" + aumento);
        System.out.println("El nuevo salario del empleado es: $" + nuevoSalario);

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
