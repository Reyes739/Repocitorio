import java.util.InputMismatchException;
import java.util.Scanner;

public class _p129_ExcepcionDulces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNinos = 0;
        int cantDulces = 0;

        while (true) {
            try {
                System.out.print("Numero de niños en el barrio: ");
                numNinos = scanner.nextInt();
                System.out.print("Cantidad de dulces existente: ");
                cantDulces = scanner.nextInt();

                if (cantDulces == 0) {
                    throw new ArithmeticException("Si no hay dulces, no puedo repartir dulces");
                }

                int dulcesPorNino = cantDulces / numNinos;
                System.out.println("A cada niño le tocan " + dulcesPorNino + " dulces.");
                break; // Sale del bucle si no hay errores
            } catch (InputMismatchException e) {
                System.out.println("Los niños y los dulces deben ser cantidades numéricas.");
                scanner.nextLine(); // Limpia el buffer del scanner
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                break; // Sale del bucle si hay división por cero
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error inesperado.");
                break; // Sale del bucle si hay un error inesperado
            }
        }

        scanner.close();
    }
}
