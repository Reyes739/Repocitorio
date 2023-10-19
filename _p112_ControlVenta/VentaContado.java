package _p112_ControlVenta;

// Clase que representa una Venta de Contado.
class VentaContado extends Venta {
    private double descuento;
    private String regalo;

    public VentaContado(String articulo, double cantidad, double precio, double descuento, String regalo) {
        super(articulo, cantidad, precio);
        this.descuento = descuento;
        this.regalo = regalo;
    }

    @Override
    public double getTotalVenta() {
        //double total = cantidad * precio;
       
        return total - (total * (descuento / 100));
    }

    @Override
    public String toString() {
        return "VentaContado " + super.toString() + ", Descuento= " + descuento + "%, Regalo= " + regalo + ", Total= " + getTotalVenta();
    }
}

