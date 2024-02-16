public class paseo {

    public static int calcularBusesNecesarios(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        // Calculamos el número total de sillas que ocuparán los estudiantes gordos y flacos
        int sillasGordos = estudiantesGordos * 2;
        int sillasFlacos = estudiantesFlacos;

        // Calculamos el número total de sillas requeridas
        int totalSillas = sillasGordos + sillasFlacos;

        // Calculamos el número de buses necesarios redondeando hacia arriba
        int busesNecesarios = (int) Math.ceil((double) totalSillas / sillasPorBus);

        return busesNecesarios;
    }

    public static void main(String[] args) {
        // Datos de entrada
        int sillasPorBus = 50; // Supongamos que un bus tiene 50 sillas
        int estudiantesGordos = 10;
        int estudiantesFlacos = 20;

        // Calculamos el número de buses necesarios
        int busesNecesarios = calcularBusesNecesarios(sillasPorBus, estudiantesGordos, estudiantesFlacos);

        // Mostramos el resultado
        System.out.println("Se necesitan alquilar " + busesNecesarios + " buses para llevar a todos los estudiantes al paseo.");
    }
}
