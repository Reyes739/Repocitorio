import java.util.Scanner;

public class _p91_MayoresPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        System.out.print("Ingrese la cantidad de calificaciones: ");
        int n = scanner.nextInt();

        // Declarar el arreglo de calificaciones
        float[] calificaciones = new float[n];

        // Capturar las calificaciones
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextFloat();
        }

        // Mostrar los elementos del arreglo
        System.out.println("Las calificaciones ingresadas son:");
        for (float calificacion : calificaciones) {
            System.out.println(calificacion);
        }

        // Calcular la suma y el promedio de las calificaciones
        float suma = 0;
        for (float calificacion : calificaciones) {
            suma += calificacion;
        }
        float promedio = suma / n;

        System.out.println("La suma de las calificaciones es: " + suma);
        System.out.println("El promedio de las calificaciones es: " + promedio);

        // Mostrar las calificaciones mayores al promedio y contar cuántas son
        int contador = 0;
        System.out.println("Las calificaciones mayores al promedio son:");
        for (float calificacion : calificaciones) {
            if (calificacion > promedio) {
                System.out.println(calificacion);
                contador++;
            }
        }

        System.out.println("El número de calificaciones mayores al promedio es: " + contador);

        scanner.close();
    }
}
