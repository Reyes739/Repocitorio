import java.util.Scanner;

public class _p77_MedidasLongitud {
    public static void main(String[] args) {
        char opcion;
        double valor, resultado;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Convertidor ");
        System.out.println("[P]ulgadas a Centímetros");
        System.out.println("[M]etros a Pies");
        System.out.print("Elige una opción (P/M): ");
        
        // Leer la opción ingresada por el usuario y convertirla a mayúsculas
        opcion = scanner.next().charAt(0);
        opcion = Character.toUpperCase(opcion);
        
        switch (opcion) {
            case 'P':
                System.out.println("\nConvertir de Pulgadas a Centímetros\n");
                System.out.print("Dame la longitud en Pulgadas: ");
                valor = scanner.nextDouble();
                resultado = pulgadasACentimetros(valor);
                System.out.printf("%.2f Pulgadas equivalen a %.2f Centímetros", valor, resultado);
                break;
            case 'M':
                System.out.println("\nConvertir de Metros a Pies\n");
                System.out.print("Dame la longitud en Metros: ");
                valor = scanner.nextDouble();
                resultado = metrosAPies(valor);
                System.out.printf("%.2f Metros equivalen a %.2f Pies", valor, resultado);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        
        System.out.println("\nGracias por utilizar este programa.");
    }
    
    // Función para convertir pulgadas a centímetros
    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }
    
    // Función para convertir metros a pies
    public static double metrosAPies(double metros) {
        return metros * 3.281;
    }
}
