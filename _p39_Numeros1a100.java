// Imprime los números de 1 a n, en incrementos de i, el usuario lo decide 
import java.util.Scanner;
public class _p39_Numeros1a100 {
    public static void main(String[] args) {
        int c, n, i;

        c = 1;
        System.out.println("Hasta donde ?"); n = new Scanner(System.in).nextInt();
        System.out.println("Incremento  ?"); i = new Scanner(System.in).nextInt();

        while (c <= n) {
            System.out.printf("%d",c);
            c = c + i;
        }
        System.out.println("\nCiclo terminado ...");
        System.out.println(c);

    }
}
