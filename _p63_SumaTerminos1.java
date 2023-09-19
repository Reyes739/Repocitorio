//imprimir la secuencia de términos armónicos el número de renglones que el usuario desee y su suma
import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.print("imprimir la secuencia de términos armónicos el número de renglones que el usuario desee y su suma:");
    
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Obtener el número de términos deseado del usuario
        System.out.printf("\n¿Cuántos términos? ");
        int numTerminos = scanner.nextInt();

        // Declarar una variable para almacenar la suma de términos
        double suma = 0.0;

        // Imprimir la secuencia de términos armónicos y calcular la suma
        System.out.print("Salida: ");
        for (int i = 1; i <= numTerminos; i++) {
            double termino = 1.0 / i; // Calcular el término actual
            suma += termino; // Sumar al acumulador
            System.out.print("1/" + i);
            if (i < numTerminos) {
                System.out.print(" + ");
            }
        }

        // Imprimir la suma de términos
        System.out.println();
        System.out.println("Suma " + suma);
    }
}
