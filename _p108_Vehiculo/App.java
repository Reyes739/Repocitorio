package _p108_Vehiculo;

public class App {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Vehiculo vehiculo1 = new Compacto("CP0100010122", "Ford", 2023, 125345.22, 4, 2);
        Vehiculo vehiculo2 = new Compacto("CP1000145555", "Nissan", 2010, 54500.33, 6, 4);
        Vehiculo vehiculo3 = new Camioneta("CA104014544", "Dina", 2008, 234567.15, 450.0, 4);
        Vehiculo vehiculo4 = new Camioneta("CA774814599", "Hongyan", 2023, 934577.98, 1200.0, 6);

        Vehiculo[] flota = { vehiculo1, vehiculo2, vehiculo3, vehiculo4 };

        System.out.println("Datos de los Vehiculos de la flota");
        for (Vehiculo vehiculo : flota) {
            System.out.println(vehiculo);
        }

        System.out.println("Calculando el total de precio de todos los vehículos ...");
        double totalPrecio = 0;
        for (Vehiculo vehiculo : flota) {
            totalPrecio += vehiculo.getPrecio();
            System.out.println(vehiculo.getPrecio());
        }

        System.out.println("La suma de precios es: " + totalPrecio);
    }
}
