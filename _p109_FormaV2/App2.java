package _p109_FormaV2;

public class App2 {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Forma forma1 = new Circulo("Rojo", true, 10.23);
        Forma forma2 = new Circulo("Verde", false, 99.12);
        Forma forma3 = new Rectangulo("Amarillo", false, 10.0, 20.0);
        Forma forma4 = new Rectangulo("Azul", true, 15.0, 44.0);

        Forma[] formas = { forma1, forma2, forma3, forma4 };

        System.out.println("Todas las formas:");
        for (Forma forma : formas) {
            System.out.println(forma);
        }

        System.out.println("Calculando áreas y perimetros de las figuras:");
        for (Forma forma : formas) {
            System.out.println("La forma es un " + forma.getClass().getSimpleName());
            System.out.println("El área es: " + forma.getArea());
            System.out.println("El perímetro es: " + forma.getPerimetro());
        }
    }
}
