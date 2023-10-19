package _p112_ControlVenta;

abstract class Venta {
    protected String articulo;
    protected double cantidad;
    protected double precio;
    protected double total;


    // Constructor de la venta.
    public Venta(String articulo, double cantidad, double precio ) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = precio *cantidad;

    }

    // Método abstracto para calcular el total de la venta.
    public abstract double getTotalVenta();

    @Override
    public String toString() {
        return "Venta [Articulo=" + articulo + ", Cantidad=" + cantidad + ", Precio=" + precio + ", Total=" + getTotalVenta() + "]";
    }
}
