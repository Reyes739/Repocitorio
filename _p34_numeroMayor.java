import java.util.Scanner;

public class _p34_numeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("Ingrese tres números enteros separados por espacios:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        
        

        int mayor = num1;

        // Verificar si num2 es mayor que el actual mayor
        if (num2 > mayor) {
            mayor = num2;
        }

        // Verificar si num3 es mayor que el actual mayor
        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El número mayor es: " + mayor);
    }
}
