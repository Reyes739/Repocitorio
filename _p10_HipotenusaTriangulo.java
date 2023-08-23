// calcular la hipotenusa de un triángulo rectángulo dadas las longitudes de sus lados

import java.util.Scanner;

public class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        double hipotenusa, longitudLado1, longitudLado2;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame el lado 1?");
        longitudLado1 = obj.nextDouble();
        System.out.println("Dame el lado 2?");
        longitudLado2 = obj.nextDouble();
        // hipotenusa = raizcuadrada( longitudLado1 * longitudLado1 + logitudLado2 *
        // longitudLado2 )
        hipotenusa = Math.sqrt(longitudLado1 * longitudLado1 + longitudLado2 * longitudLado2);

        System.out.println("El valor de la hipotenusa es: " + hipotenusa);
    }
}
