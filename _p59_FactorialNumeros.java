// Calcula e imprime el factorial de n numeros 

import java.util.Scanner;

public class _p59_FactorialNumeros {
    public static void main(String[] args) {

        int n, f;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Hasta que numero deseas el factorial ? ");
            n = obj.nextInt();
            for (int k = 1; k <= n; k++) {
                f = 1;
                System.out.printf("%d! =", k);
                for (int i = 1; i <= k; i++) {
                    System.out.printf(" %d * ",i);
                    f = f * i;

                }
                System.out.printf(" = %d \n",f);
            }
            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado ..");
    }
}
