// Acepta a un estudiante en base a su edad y sus calificaciones
import java.util.Scanner;

public class _p27_AceptarEstudiante {
    public static void main(String[] args) {
        String nombre="";
        int edad=0;
        float c1=0,c2=0;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Acepta a un estudiante en base a su edad y sus calificaciones\n");
        System.out.print("Dame tu nombre ? "); nombre = obj.nextLine();
        System.out.print("Dame la edad ? "); edad = obj.nextInt();
        
        if( edad < 18 ) {
            System.out.println("Solo aseptamos estudiantes mayores de edad ");
        } 
        else {
            System.out.println("Dame dos calificaciones separadas por enter");
            c1 = obj.nextFloat();
            if (c1<8 || c2<8 )
                System.out.println("Solo aseptamos aspirantes con calificaciones mayores a 8");
            else
                System.out.printf("Bienvenido %s, tienes %d años de edad y tus calificaciones son %.2f y %.2f", nombre, edad, c1, c2);
        }
         System.out.println("\nProceso terminado ...");
    }
}
