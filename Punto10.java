import java.util.Scanner;

public class Punto10 {
    
    // Función para realizar operaciones aritméticas
    public static double calcularResultado(double num1, double num2, String operador) {
        double resultado = 0;
        
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            case "%":
                if (num2 != 0) {
                    resultado = num1 % num2;
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            case "**":
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Operador no válido.");
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los dos números y el operador
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el operador aritmético (+, -, *, /, %, **): ");
        String operador = scanner.next();

        // Calcular el resultado utilizando la función
        double resultado = calcularResultado(numero1, numero2, operador);

        // Mostrar el resultado
        System.out.println("El resultado de la operación es: " + resultado);

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
