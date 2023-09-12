// calcula la temperatura convertida de grados centígrados a grados farenheit de un rango de valores introducidos por el usuario,

import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner obj = new Scanner(System.in);
        char resp;

        do {
            System.out.print("\033[H\033[2J");
            System.out.print("calcular la temperatura convertida de grados centigrados a grados farenheit de un rango de valores introducidos por el usuario. ");
            System.out.printf("\nTemperatura Inicial (grados centígrados): ");
            double temperaturaInicial = scanner.nextDouble();

            System.out.print("Temperatura Final (grados centígrados, mayor o igual que la inicial): ");
            double temperaturaFinal = scanner.nextDouble();

            if (temperaturaFinal < temperaturaInicial) {
                System.out.println("Error: La temperatura final no puede ser menor que la temperatura inicial.");
            } else {
                System.out.println("------------------------------------");
                System.out.println("Centígrados  Fahrenheit");
                System.out.println("------------------------------------");

                double celsius = temperaturaInicial;

                while (celsius <= temperaturaFinal) {
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.printf("%.2f         %.2f%n", celsius, fahrenheit);
                    celsius++;
                }

                System.out.println("------------------------------------");
            }

            System.out.print("¿Deseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}


