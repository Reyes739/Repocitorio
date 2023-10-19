package _p112_ControlVenta;
import java.util.ArrayList;
import java.util.List;

// Clase que representa a una Tienda.
class Tienda {
    private String propietario;
    private String domicilio;
    private List<Cliente> clientes;

    public Tienda(String propietario, String domicilio) {
        this.propietario = propietario;
        this.domicilio = domicilio;
        this.clientes = new ArrayList<>();
    }

    // Método para agregar un cliente a la tienda.
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Método para calcular el total de las ventas de todos los clientes de la tienda.
    public double getTotal() {
        double total = 0.0;
        for (Cliente cliente : clientes) {
            total += cliente.getTotal();
        }
        return total;
    }

    // Método para generar un reporte de ventas.
    public void reporte() {
        System.out.println("Reporte de clientes sin ventas : " + this);
        for (Cliente cliente : clientes) {
            if (cliente.getTotal() == 0) {
                System.out.println(">> " + cliente);
            }
        }

        System.out.println("\nReporte de ventas de los clientes : " + this);
        for (Cliente cliente : clientes) {
            if (cliente.getTotal() > 0) {
                System.out.println(">> " + cliente);
                for (Venta venta : cliente.getVentas()) {
                    System.out.println(venta);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Tienda [Propietario= " + propietario + ", Domicilio= " + domicilio + ", Clientes= " + clientes.size() + ", Total= " + getTotal() + "]";
    }
}
