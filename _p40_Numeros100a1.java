// Imprime los números de 1 a n, en incrementos de i, el usuario lo decide 
import java.util.Scanner;

public class _p40_Numeros100a1 {
    public static void main(String[] args) {
        int c, n, i;

        System.out.println("Hasta donde ?"); n = new Scanner(System.in).nextInt();
        System.out.println("Decremento  ?"); i = new Scanner(System.in).nextInt();

        c = n;

        while (c >= 1) {
            System.out.printf("%d",c);
            c = c - i;
        }
        System.out.println("\nCiclo terminado ...");
        System.out.println(c);

    }
}
