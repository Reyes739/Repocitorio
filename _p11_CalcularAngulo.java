// calcular el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo

import java.util.Scanner;

public class _p11_CalcularAngulo {
    public static void main(String[] args) {
        double angulo3, angulo1, angulo2;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame el primer angulo?");
        angulo1 = obj.nextDouble();
        System.out.println("Dame el segundo angulo?");
        angulo2 = obj.nextDouble();
        // angulo3 = 180 – (angulo1 + angulo2)
        angulo3 = 180 - (angulo1 + angulo2);

        System.out.println("El valor del angulo 3 es : " + angulo3);
    }
}
