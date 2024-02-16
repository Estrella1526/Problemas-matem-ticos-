import java.util.Scanner;

public class DiadeMañana {

    // Función para obtener el día siguiente
    public static String obtenerDiaSiguiente(String diaActual) {
        switch (diaActual.toLowerCase()) {
            case "lunes":
                return "martes";
            case "martes":
                return "miércoles";
            case "miércoles":
                return "jueves";
            case "jueves":
                return "viernes";
            case "viernes":
                return "sábado";
            case "sábado":
                return "domingo";
            case "domingo":
                return "lunes";
            default:
                return "Día no válido";
        }
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el nombre del día
        System.out.print("Ingrese el nombre del día: ");
        String diaActual = scanner.nextLine();

        // Obtener el nombre del día siguiente
        String diaSiguiente = obtenerDiaSiguiente(diaActual);

        // Mostrar el resultado
        System.out.println("El día de mañana es: " + diaSiguiente);

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
