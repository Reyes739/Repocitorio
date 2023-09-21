import java.util.Scanner;

public class _p78_SumaMultiplos {
     public static int sumaMultiplos(int ini, int fin, int constante) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if ((constante == 3 && i % 3 == 0) || (constante == 4 && i % 4 == 0)) {
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int ini, fin, suma, constante;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Valor inicial ? ");
        ini = obj.nextInt();
        System.out.print("Valor final ? ");
        fin = obj.nextInt();
        System.out.print("\n[3] Múltiplos de 3 \n[4] Múltiplos de 4 ? ");
        constante = obj.nextInt();
        suma = sumaMultiplos(ini, fin, constante);
        System.out.printf("\nLa suma de múltiplos de %d en el rango de %d a %d es: %d", constante, ini, fin, suma);
    }
}