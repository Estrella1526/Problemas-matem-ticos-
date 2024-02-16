import java.util.Scanner;

public class paseo {

    public static int calcularBusesNecesarios(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        // Calculamos el número total de sillas que ocuparán los estudiantes gordos y flacos
        int sillasGordos = estudiantesGordos * 2;
        int sillasFlacos = estudiantesFlacos;

        // Calculamos el número total de sillas requeridas
        int totalSillas = sillasGordos + sillasFlacos;

        // Calculamos el número de buses necesarios redondeando hacia arriba
        int busesNecesarios = totalSillas / sillasPorBus;
        if (totalSillas % sillasPorBus != 0) {
            busesNecesarios++; // Agregamos un bus adicional si hay espacio adicional
        }

        return busesNecesarios;
    }

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese la cantidad de sillas por bus
        System.out.print("Ingrese la cantidad de sillas por bus: ");
        int sillasPorBus = scanner.nextInt();

        // Solicitamos al usuario que ingrese la cantidad de estudiantes gordos
        System.out.print("Ingrese la cantidad de estudiantes gordos: ");
        int estudiantesGordos = scanner.nextInt();

        // Solicitamos al usuario que ingrese la cantidad de estudiantes flacos
        System.out.print("Ingrese la cantidad de estudiantes flacos: ");
        int estudiantesFlacos = scanner.nextInt();

        // Calculamos el número de buses necesarios
        int busesNecesarios = calcularBusesNecesarios(sillasPorBus, estudiantesGordos, estudiantesFlacos);

        // Mostramos el resultado
        System.out.println("Se necesitan alquilar " + busesNecesarios + " buses para llevar a todos los estudiantes al paseo.");

        // Cerramos el scanner para liberar recursos
        scanner.close();
    }
}
