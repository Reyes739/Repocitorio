import java.util.Scanner;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.print("imprimir la secuencia de términos armónicos el número de renglones que el usuario desee y su suma:");

        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Obtener el número de términos deseado del usuario
        System.out.printf("\n¿Cuántos términos? ");
        int numTerminos = scanner.nextInt();

        // Declarar una variable para almacenar la suma de términos
        int suma = 0;

        // Inicializar una variable para el término actual
        int termino = 1;

        // Imprimir la secuencia de términos y calcular la suma
        System.out.print("Salida: ");
        for (int i = 0; i < numTerminos; i++) {
            System.out.print(termino);
            suma += termino;
            
            if (i < numTerminos - 1) {
                System.out.print("+");
            }
            
            termino = termino * 10 + 1;
        }

        // Imprimir la suma de términos
        System.out.println();
        System.out.println("Suma " + suma);
    }
}
