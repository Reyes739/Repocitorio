package _p131_ExcepcionTemperatura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Dame una temperatura en centigrados: ");
                double temperaturaCelsius = scanner.nextDouble();

                if (temperaturaCelsius > 100) {
                    throw new TemperaturaExcesiva("Temperatura demasiado alta, no se puede convertir");
                }

                double temperaturaFahrenheit = convertirAFahrenheit(temperaturaCelsius);

                System.out.printf("%.2f grados centigrados, equivale a %.2f grados Fahrenheit\n", temperaturaCelsius, temperaturaFahrenheit);
                break;
            } catch (InputMismatchException e) {
                System.out.println("La temperatura a convertir debe ser un valor numérico");
                scanner.next(); // Limpia el buffer del scanner
            } catch (TemperaturaExcesiva e) {
                System.out.println("Error: " + e);
                break;
            }
        }

        scanner.close();
    }

    public static double convertirAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
