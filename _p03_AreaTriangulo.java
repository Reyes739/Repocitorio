//Calcula el area del triangulo 

import java.util.Scanner;

public class _p03_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;

        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalcular el area del triangulo");
        System.out.print("Dame la base? ");
        base = obj.nextInt();
        System.out.print("Dame la altura? ");
        altura = obj.nextInt();

        area = base * altura / 2;

        System.out.println(
                String.format("El triangulo de base %d y altura %d tiene una area de %.2f", base, altura, area));
    }
}
