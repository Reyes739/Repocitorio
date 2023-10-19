package _p112_ControlVenta;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // Crea una instancia de la tienda.
        Tienda tienda = new Tienda("Carlos Castaneda", "Av. Luis Moya 345");

        // Crea clientes y agrega ventas.
        Cliente cliente1 = new Cliente("Felipe Calderon", "Las Lomas 123", "calde@msn.com");
        cliente1.agregarVenta(new VentaContado("Martillo", 10, 60.50, 10, "Sacabrocados"));
        cliente1.agregarVenta(new VentaCredito("Pala", 2, 1170.55, 3, 10));
        tienda.agregarCliente(cliente1);

        Cliente cliente2 = new Cliente("Enrique Peña", "5 de Mayo 321", "quique@gmail.com");
        cliente2.agregarVenta(new VentaCredito("Clavo", 2.5, 160.34, 2, 20));
        cliente2.agregarVenta(new VentaCredito("Cinta de Aislar", 5, 71.34, 6, 20));
        cliente2.agregarVenta(new VentaContado("Pinzas", 10, 650.33, 20, "Taladro"));
        tienda.agregarCliente(cliente2);

        Cliente cliente3 = new Cliente("Andres Lopez", "Palacio Nacional 321", "peje@yahoo.com");
        cliente3.agregarVenta(new VentaContado("Thiner", 50, 65.00, 10, "Aerosol"));
        tienda.agregarCliente(cliente3);

        Cliente cliente4 = new Cliente("Xochitl Gelatinas", "Danone 123", "xochitl@precidencia.gob.mx");
        tienda.agregarCliente(cliente4);

        // Genera el reporte.
        tienda.reporte();
    }
}