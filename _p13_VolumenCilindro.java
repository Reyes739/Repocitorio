// Calcula el volumen de un cilindro 

import java.util.Scanner;

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        double radio, volumen, altura;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame la altura?");
        altura = obj.nextDouble();

        System.out.println("Dame el radio?");
        radio = obj.nextDouble();

        // volumen = PI * (radio * radio) * altura
        volumen = Math.PI * (radio * radio) * altura;

        System.out.println("El valor del volumen es  :" + volumen);
    }
}
