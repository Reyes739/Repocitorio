package _p108_Vehiculo;

// Clase Compacto que hereda de Vehiculo
class Compacto extends Vehiculo {
    private int Pasajeros;
    private int Puertas;

    public Compacto() {
    }

    public Compacto(String serie, String marca, int año, double precio, int pasajeros, int puertas) {
        super(serie, marca, año, precio);
        this.Pasajeros = pasajeros;
        this.Puertas = puertas;
    }

    public int getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        Pasajeros = pasajeros;
    }

    public int getPuertas() {
        return Puertas;
    }

    public void setPuertas(int puertas) {
        Puertas = puertas;
    }

    @Override
    public String toString() {
        return "Compacto [" + super.toString() + ", Pasajeros=" + Pasajeros + ", Puertas=" + Puertas + "]";
    }
}
