import java.util.Scanner;

public class _p38_aceptarEstudianteV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        // Solicitar al usuario que ingrese el nombre del estudiante
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        // Solicitar al usuario que ingrese el sexo del estudiante (h/m)
        System.out.print("Ingrese el sexo del estudiante (h/m): ");
        char sexo = scanner.nextLine().charAt(0);

        // Solicitar al usuario que ingrese la edad del estudiante
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();

        // Solicitar al usuario que ingrese las tres calificaciones
        System.out.print("Ingrese la primera calificación: ");
        double calificacion1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda calificación: ");
        double calificacion2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera calificación: ");
        double calificacion3 = scanner.nextDouble();


        // Verificar si el estudiante cumple con los criterios de admisión
        if (sexo == 'm' && edad > 21 && calificacion1 >= 8 && calificacion2 >= 8 && calificacion3 >= 8
                && calificacion1 <= 9.5 && calificacion2 <= 9.5 && calificacion3 <= 9.5) {
            System.out.println(nombre + " es aceptada en la Universidad Kitty Kat SA.");
        } else {
            System.out.println(nombre + " no cumple con los criterios de admisión.");
        }
    }
}
