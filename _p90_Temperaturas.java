public class _p90_Temperaturas {
    public static void main(String[] args) {
        // Declarar e inicializar el arreglo de temperaturas
        System.out.print("\033[H\033[2J");
        float[] temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};

        // Mostrar el primer elemento
        System.out.println("El primer elemento es: " + temperaturas[0]);

        // Mostrar el tercer elemento
        System.out.println("El tercer elemento es: " + temperaturas[2]);

        // Mostrar todos los elementos del arreglo
        System.out.println("Los elementos del arreglo son:");
        for (float temperatura : temperaturas) {
            System.out.println(temperatura);
        }

        // Poner a 0 todos los elementos mayores a 10
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > 10) {
                temperaturas[i] = 0;
            }
        }

        // Mostrar nuevamente los elementos del arreglo
        System.out.println("Después de poner a 0 los elementos mayores a 10, el arreglo es:");
        for (float temperatura : temperaturas) {
            System.out.println(temperatura);
        }
    }
}