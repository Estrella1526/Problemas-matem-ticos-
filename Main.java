public class Main {
    // Método estático para calcular el valor de la función
    public static double calcularFuncion(double x, double y) {
        return x * x + 2 * x * y + y * y;
    }

    public static void main(String[] args) {
        // Definir los valores de x y y para los que deseamos calcular la función
        double x = 3.0;
        double y = 4.0;

        // Calcular el valor de la función para los valores dados de x e y
        double resultado = calcularFuncion(x, y);

        // Imprimir el resultado
        System.out.println("El valor de la función para x = " + x + " y y = " + y + " es: " + resultado);
    }
}
