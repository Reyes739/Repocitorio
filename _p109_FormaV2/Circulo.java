package _p109_FormaV2;

// Clase Circulo que hereda de Forma
class Circulo extends Forma {
    private double Radio;

    public Circulo() {
    }

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.Radio = radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Radio * Radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * Radio;
    }

    @Override
    public String toString() {
        return "Circulo [" + super.toString() + ", Radio=" + Radio + "]";
    }
}