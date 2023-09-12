// imprime los números pares desde 100 hasta el número que el usuario decida (n).

import java.util.Scanner;

public class _p49_ParesDescendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner obj = new Scanner(System.in);
        char resp;
        int suma = 0;
        int contador = 0;
        int numero = 100;

        do {
            System.out.print("\033[H\033[2J");
            System.out.print("imprime los numros pares desde 100 hasta el numero que el usuario decida (n). ");
            System.out.printf("\nIngrese un número (n): ");
            int n = scanner.nextInt();

            System.out.println("Números pares entre 100 y " + n + ":");

            

            while (numero >= 2 && numero >= n) {
                if (numero % 2 == 0) {
                    System.out.print(numero + " ");
                    suma += numero;
                    contador++;
                }
                numero -= 2;
            }

            double promedio = (double) suma / contador;
            System.out.println("\nSuma de los números pares: " + suma);
            System.out.println("Promedio de los números pares: " + promedio);

            System.out.print("¿Desea continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}


