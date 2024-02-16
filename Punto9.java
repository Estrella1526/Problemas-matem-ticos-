import java.util.Scanner;

public class Punto9 {
    
    // Función para encontrar el mayor de dos números enteros
    public static int encontrarMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Encontrar el mayor de los dos números utilizando la función anterior
        int mayor = encontrarMayor(numero1, numero2);

        // Mostrar el resultado
        System.out.println("El mayor número es: " + mayor);

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
