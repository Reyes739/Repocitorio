import java.util.InputMismatchException;
import java.util.Scanner;

public class _p128_ExcepcionRaiz {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] edades = new int[5];

        System.out.println("Captura las edades de 5 personas:");

        int i = 0;
        while (i < 5) {
            try {
                System.out.print("Edad persona " + (i + 1) + ": ");
                edades[i] = scanner.nextInt();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número entero");
                scanner.next(); // Limpia el buffer del scanner
            }
        }

        System.out.print("Captura terminada, las edades son: ");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }

        scanner.close();
    }
}
