
//Calcilar la paga de un trabajador 
import java.util.Scanner;

public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        float paga, tasa, impuesto, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);

        System.out.print("Nombre del tabajador");
        nombre = obj.nextLine();
        System.out.print("Horas trabajadas?");
        horas = obj.nextInt();
        System.out.print("Paga x hora  ?");
        paga = obj.nextFloat();
        tasa = 0.3f;
        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;

        System.out.println("\nResumen de Pago\n");
        System.out.println(String.format(
                "El trabajador %s, trabajo %d, horas, a un pago de %.2f pesos la hora, con una tasa de inpuesto de %.2f",
                nombre, horas, paga, tasa));
        System.out.println(String.format("Paga bruta      =%.2f", pagabruta));
        System.out.println(String.format("Impuestos       =%.2f", impuesto));
        System.out.println(String.format("Paga neta       =%.2f", paganeta));

    }
}
