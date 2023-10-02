import java.util.Scanner;

public class _p92_MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        // Declarar el arreglo de números enteros
        int[] numeros = new int[n];

        // Capturar los números
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los elementos del arreglo
        System.out.println("Los números ingresados son:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Encontrar el número mayor
        int numeroMayor = numeros[0];
        for (int i = 1; i < n; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + numeroMayor);

        // Encontrar el número menor
        int numeroMenor = numeros[0];
        for (int i = 1; i < n; i++) {
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }
        System.out.println("El número menor es: " + numeroMenor);

        scanner.close();
    }
}
