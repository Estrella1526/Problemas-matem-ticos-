import java.util.Scanner;

public class Universidad {
    
    // Función para calcular el número de salones del nuevo edificio
    public static int calcularNumeroSalones(int numEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numEstudiantes / capacidadSalon);
    }

    // Función para calcular el número de pisos del nuevo edificio
    public static int calcularNumeroPisos(int numSalones, int salonesPorPiso) {
        return (int) Math.ceil((double) numSalones / salonesPorPiso);
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los datos
        System.out.print("Ingrese el número de estudiantes de la universidad: ");
        int numEstudiantes = scanner.nextInt();

        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();

        System.out.print("Ingrese el número de salones que tendrá un piso del edificio: ");
        int salonesPorPiso = scanner.nextInt();

        // Calcular el número de salones del nuevo edificio
        int numSalones = calcularNumeroSalones(numEstudiantes, capacidadSalon);

        // Calcular el número de pisos del nuevo edificio
        int numPisos = calcularNumeroPisos(numSalones, salonesPorPiso);

        // Mostrar los resultados
        System.out.println("Número de salones del nuevo edificio: " + numSalones);
        System.out.println("Número de pisos del nuevo edificio: " + numPisos);

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
