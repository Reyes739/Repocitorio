//imprimir los primeros n números de la será de fibbonaci.

import java.util.Scanner;

public class _p51_SerieFibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner obj = new Scanner(System.in);
        char resp;
        int a = 0;
        int b = 1;
        int i = 0;

        do {
            System.out.print("\033[H\033[2J");
            System.out.print("imprimir los primeros n numeros de fibbonaci.");
            System.out.printf("\nIngrese el valor máximo (n) para la sucesión de Fibonacci: ");
            int n = scanner.nextInt();

            System.out.println("La sucesión Fibonacci es:");

            while (i < n) {
                System.out.print(a + " ");
                int temp = a + b;
                a = b;
                b = temp;
                i++;
            }

            System.out.println();

            System.out.print("¿Desea continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
