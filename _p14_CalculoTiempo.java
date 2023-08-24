//Calcula el tiempo de horas a dias, minutos y segundos 

import java.util.Scanner;

public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        double horas, dias, minutos, segundos;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame eltiempo en horas?");
        horas = obj.nextDouble();

        // 1 día tiene 24 horas 1 hora tiene 60 minutos 1 minuto tiene 60 segundos.
        dias = horas / 24.0;
        minutos = horas * 60.0;
        segundos = minutos * 60.0;

        System.out.println("El valor de dias es     : " + dias);
        System.out.println("El valor de minutos es  : " + minutos);
        System.out.println("El valor de segundos es : " + segundos);
    }
}
