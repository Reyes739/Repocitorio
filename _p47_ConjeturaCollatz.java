//imprime los numeros generados por la conjetura de collatz

import java.util.Scanner;

public class _p47_ConjeturaCollatz {
    public static void main(String[] args) {
        int n;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\n//imprime los numeros generados por la conjetura de collatz");
            do {
                System.out.print("Dame un numero positivo ? ");
                n = obj.nextInt();
            } while (n <= 1);
            do {
                System.out.printf("%d ", n);
                if (n % 2 == 0)
                    n = n / 2;
                else
                    n = n * 3 + 1;
            } while (n != 1);
            System.out.printf("%d ", n);
            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
