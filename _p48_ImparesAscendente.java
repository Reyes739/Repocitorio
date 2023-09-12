// imprime los números impares de forma ascendente desde 1 hasta el número que el usuario decida (n).

import java.util.Scanner;

public class _p48_ImparesAscendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner obj = new Scanner(System.in);
        char resp;
        int suma = 0;
        int contador = 0;
        int numero = 1;

        do {
            System.out.print("\033[H\033[2J");
            System.out.print("imprime los numeros impares de forma ascendente desde 1 hasta el numero que el usuario decida (n).");
            System.out.printf("\nIngrese un número (n): ");
            int n = scanner.nextInt();

            System.out.println("Números impares desde 1 hasta " + n + ":");

            while (numero <= n) {
                if (numero % 2 != 0) {
                    System.out.print(numero + " ");
                    suma += numero;
                    contador++;
                }
                numero++;
            }

            double promedio = (double) suma / contador;
            System.out.println("\nSuma de los números impares: " + suma);
            System.out.println("Promedio de los números impares: " + promedio);

            System.out.print("¿Desea repetir? (S/N): ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
