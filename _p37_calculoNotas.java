import java.util.Scanner;

public class _p37_calculoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        

        // Solicitar al usuario que ingrese las 5 calificaciones
        System.out.println("Ingrese las 5 calificaciones:");
        double calificacion1 = scanner.nextDouble();
        double calificacion2 = scanner.nextDouble();
        double calificacion3 = scanner.nextDouble();
        double calificacion4 = scanner.nextDouble();
        double calificacion5 = scanner.nextDouble();

        // Calcular el promedio de las calificaciones
        double promedio = (calificacion1 + calificacion2 + calificacion3 + calificacion4 + calificacion5) / 5;

        // Evaluar el resultado y mostrar el mensaje correspondiente
        if (promedio > 0 && promedio <= 6) {
            System.out.println("Quedas reprobado");
        } else if (promedio > 6 && promedio <= 7) {
            System.out.println("Pasas de panzazo");
        } else if (promedio > 7 && promedio <= 8) {
            System.out.println("Muy bien, puedes mejorar");
        } else if (promedio > 8 && promedio <= 9) {
            System.out.println("Excelente, sigue así");
        } else if (promedio > 9 && promedio <= 10) {
            System.out.println("¡Perfecto! Tu esfuerzo valió la pena");
        } else {
            System.out.println("El promedio ingresado no es válido");
        }
    }
}
