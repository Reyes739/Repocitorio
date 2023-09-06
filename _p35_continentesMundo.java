import java.util.Scanner;

public class _p35_continentesMundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        System.out.println("Ingrese un número entero entre 1 y 6:");
        int numero = scanner.nextInt();

        // Usamos una estructura switch para asignar el nombre del continente correspondiente al número
        String continente;
        switch (numero) {
            case 1:
                continente = "Asia";
                break;
            case 2:
                continente = "África";
                break;
            case 3:
                continente = "América del Norte";
                break;
            case 4:
                continente = "América del Sur";
                break;
            case 5:
                continente = "Antártida";
                break;
            case 6:
                continente = "Europa";
                break;
            default:
                continente = "Error: El número debe estar entre 1 y 6.";
                break;
        }

        System.out.println("El continente correspondiente al número " + numero + " es: " + continente);

    }
}
