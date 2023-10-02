import java.util.Random;

public class _p93_ParesImpares {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        int MAX = 100; // Tamaño máximo de los arreglos
        int[] a = new int[MAX];
        int[] pares;
        int[] impares;
        int contadorPares = 0;
        int contadorImpares = 0;

        // Generar números aleatorios entre 0 y 20 y llenar el arreglo a[]
        Random rand = new Random();
        for (int i = 0; i < MAX; i++) {
            a[i] = rand.nextInt(21); // Genera números aleatorios entre 0 y 20
        }

        // Mostrar elementos del arreglo a[]
        System.out.println("Elementos del arreglo a[]:");
        for (int i = 0; i < MAX; i++) {
            System.out.print(a[i] + " ");

            // Contar y mostrar los elementos pares
            if (a[i] % 2 == 0) {
                contadorPares++;
            }
            // Contar y mostrar los elementos impares
            else {
                contadorImpares++;
            }
        }
        System.out.println(); // Salto de línea

        // Inicializar los arreglos pares e impares con el tamaño adecuado
        pares = new int[contadorPares];
        impares = new int[contadorImpares];

        // Llenar los arreglos pares e impares
        int indicePares = 0;
        int indiceImpares = 0;
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 == 0) {
                pares[indicePares] = a[i];
                indicePares++;
            } else {
                impares[indiceImpares] = a[i];
                indiceImpares++;
            }
        }

        // Mostrar elementos pares
        System.out.println("Elementos pares:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println(); // Salto de línea

        // Mostrar elementos impares
        System.out.println("Elementos impares:");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println(); // Salto de línea
    }
    
}