import java.util.Scanner;

public class _p33_numerosconsecutivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("Ingrese tres números enteros separados por espacios:");
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
       
        

        // Verificar si los números son consecutivos
        if (num2 == num1 + 1 && num3 == num2 + 1) {
            System.out.println("Los números " + num1 + ", " + num2 + ", " + num3 + " son consecutivos.");
        } else {
            System.out.println("Los números " + num1 + ", " + num2 + ", " + num3 + " no son consecutivos.");
        }

    }
}
