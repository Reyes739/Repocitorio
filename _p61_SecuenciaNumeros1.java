//imprime la secuencia de números mostrados el número de renglones que el usuario desee.

import java.util.Scanner;

public class _p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("imprime la secuencia de números mostrados el número de renglones que el usuario desee.");

        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Obtener el número de filas deseado del usuario
        System.out.print("¿Cuántos renglones? ");
        int numFilas = scanner.nextInt();

        // Iterar a través de las filas
        for (int i = 1; i <= numFilas; i++) {
            // Imprimir cada número en la fila repetido i veces
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // Salto de línea al final de la fila
            System.out.println();
        }
    }
}
