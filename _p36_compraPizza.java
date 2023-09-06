import java.util.Scanner;


public class _p36_compraPizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        
        // Precios de las pizzas
        double precioChica = 5.0;
        double precioMediana = 10.0;
        double precioGrande = 20.0;

        // Solicitar al usuario que elija el tamaño de la pizza
        System.out.println("Elija el tamaño de la pizza:");
        System.out.println("1. Chica ($5)");
        System.out.println("2. Mediana ($10)");
        System.out.println("3. Grande ($20)");
        int opcion = scanner.nextInt();

        // Verificar la elección del usuario
        double precioPizza = 0.0;
        if (opcion == 1) {
            precioPizza = precioChica;
        } else if (opcion == 2) {
            precioPizza = precioMediana;
        } else if (opcion == 3) {
            precioPizza = precioGrande;
        } else {
            System.out.println("Opción no válida. Saliendo del programa.");
            scanner.close();
            return;
        }

        // Solicitar al usuario la cantidad de pizzas
        System.out.println("Ingrese la cantidad de pizzas que desea comprar:");
        int cantidad = scanner.nextInt();

        // Calcular el total de la compra sin descuento
        double totalSinDescuento = precioPizza * cantidad;

        // Calcular el descuento si el total es mayor a $2000
        double descuento = 0.0;
        if (totalSinDescuento > 2000.0) {
            descuento = 0.15 * totalSinDescuento;
        }

        // Calcular el total de la compra con descuento
        double totalConDescuento = totalSinDescuento - descuento;

        // Imprimir la información
        System.out.println("Tamaño de la compra: $" + totalSinDescuento);
        System.out.println("Cantidad comprada: " + cantidad + " pizzas");
        System.out.println("Total compra: $" + totalSinDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total compra con descuento: $" + totalConDescuento);

    }
}
