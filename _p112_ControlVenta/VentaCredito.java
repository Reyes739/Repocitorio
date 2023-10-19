package _p112_ControlVenta;

// Clase que representa una Venta a Crédito.
class VentaCredito extends Venta {
    private int meses;
    private double interes;

    public VentaCredito(String articulo, double cantidad, double precio, int meses, double interes) {
        super(articulo, cantidad, precio);
        this.meses = meses;
        this.interes = interes;
    }

    @Override
    public double getTotalVenta() {
        // double total = cantidad * precio;
        return total + (total * (meses * interes / 100));
    }

    @Override
    public String toString() {
        return "VentaCredito " + super.toString() + ", Meses= " + meses + ", Interes= " + interes + "%, TotalVenta= " + getTotalVenta();
    }
}