package _p108_Vehiculo;

class Vehiculo {
    private String Serie;
    private String Marca;
    private int Año;
    private double Precio;

    public Vehiculo() {
    }

    public Vehiculo(String serie, String marca, int año, double precio) {
        this.Serie = serie;
        this.Marca = marca;
        this.Año = año;
        this.Precio = precio;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        Año = año;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo [Serie=" + Serie + ", Marca=" + Marca + ", Año=" + Año + ", Precio=" + Precio + "]";
    }
}
