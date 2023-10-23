package _p113_SegundoExamenParcial;


abstract class Jugador {
    private String Nombre;
    private char Sexo;
    private String Descripcion;
    private double Salario;
    protected double Total;

    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        this.Nombre = nombre;
        this.Sexo = sexo;
        this.Descripcion = descripcion;
        this.Salario = salario;
        this.Total = calcularTotal();
    }

    public abstract double getBono();

    protected double calcularTotal() {
        return Salario + getBono();
    }

    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripcion=" + Descripcion + ", Salario=" + Salario + ", Bono=" + getBono() + ", Total=" + Total + "]";
    }
}
