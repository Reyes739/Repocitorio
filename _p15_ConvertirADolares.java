//convierte de pesos a dolares 

import java.util.Scanner;

public class _p15_ConvertirADolares {
    public static void main(String[] args) {
        double pesos, cotisacion, dolar;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame la cantidad en pesos?");
        pesos = obj.nextDouble();

        System.out.println("Dame la cotizacion del dolar?");
        cotisacion = obj.nextDouble();

        dolar = pesos / cotisacion;

        System.out.println("El valor del dolar es :" + dolar);
    }
}
