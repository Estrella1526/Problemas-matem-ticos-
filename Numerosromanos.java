import java.util.Scanner;

public class Numerosromanos {

    
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }

    
    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }

    
    public static String convertirDigito(int digito) {
        switch (digito) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            default:
                return "";
        }
    }

    
    public static String convertirDecenas(int numero) {
        switch (numero) {
            case 1:
                return "X";
            case 2:
                return "XX";
            case 3:
                return "XXX";
            case 4:
                return "XL";
            case 5:
                return "L";
            case 6:
                return "LX";
            case 7:
                return "LXX";
            case 8:
                return "LXXX";
            case 9:
                return "XC";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número entero (entre 1 y 99): ");
        int numero = scanner.nextInt();

        
        if (numero > 0 && numero < 100) {
            
            int decenas = obtenerDecenas(numero);
            int unidades = obtenerUnidades(numero);

            
            String romanoDecenas = convertirDecenas(decenas);
            String romanoUnidades = convertirDigito(unidades);

            
            System.out.println("El número " + numero + " en números romanos es: " + romanoDecenas + romanoUnidades);
        } else {
            
            System.out.println("El número debe ser un entero positivo entre 1 y 99.");
        }

        
        scanner.close();
    }
}
