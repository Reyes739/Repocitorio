// Convierte la temperatura de grados clsius a fahrenheit

import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        double celcius, fahrenheit;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame los grados fahrenheit?");
        fahrenheit = obj.nextDouble();

        // • celsius = (fahrenheit – 32) * (5/9).
        celcius = (fahrenheit - 32) * (5.0 / 9.0);

        System.out.println("El valor de los grados celsius es :" + celcius);
    }
}
