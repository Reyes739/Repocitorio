package _p112_ControlVenta;
import java.util.ArrayList;
import java.util.List;

// Clase que representa a un Cliente.
class Cliente {
    private String nombre;
    private String domicilio;
    private String correo;
    private List<Venta> ventas;

    public Cliente(String nombre, String domicilio, String correo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.correo = correo;
        this.ventas = new ArrayList<>();
    }

    // Método para agregar una venta al cliente.
    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    
    }

    // Método para calcular el total de las ventas del cliente.
    public double getTotal() {
        double total = 0.0;
        for (Venta venta : ventas) {
            total += venta.getTotalVenta();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Cliente [Nombre= " + nombre + ", Domicilio= " + domicilio + ", Correo= " + correo + ", Ventas= " + ventas.size() + ", Total= " + getTotal() + " ]";
    }



    public List<Venta> getVentas() {
        return ventas;
    }
}
