// Imprime tabla de conversión de peso a dolar en un rango de valores 
//1.. 10  10.. 1x

import java.util.Scanner;

public class _p46_TablaConversion {
    public static void main(String[] args) {
        float c, ini, fin, tc=17.53f, tcl=21.86f;
       Scanner obj = new Scanner(System.in);
        char resp;
        
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Imprime tabla de conversi\u00F3n de peso a dolar en un rango de valores \n");
            do {
                System.out.print("Inicio : ");
                ini = obj.nextInt();
                System.out.print("Fin : ");
                fin = obj.nextInt();
            } while (fin < ini);
            c = ini;
            System.out.println("Peso\tDolar\tLibra");
            while (c <= fin) {
                System.out.printf("%.2f\t%.2f\t%.2f\n", c, c / tc, c / tcl);
                c++;
            }
            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
