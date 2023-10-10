package _p105_PuntoTriangulo;

public class Triangulo {
    private Punto v1;
    private Punto v2;
    private Punto v3;

    public Triangulo() {
        this.v1 = new Punto(0, 0);
        this.v2 = new Punto(0, 0);
        this.v3 = new Punto(0, 0);
    }

    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Punto getV1() {
        return v1;
    }

    public void setV1(Punto v1) {
        this.v1 = v1;
    }

    public Punto getV2() {
        return v2;
    }

    public void setV2(Punto v2) {
        this.v2 = v2;
    }

    public Punto getV3() {
        return v3;
    }

    public void setV3(Punto v3) {
        this.v3 = v3;
    }

    public double getPerimetro() {
        double distanciaV1V2 = calcularDistancia(v1, v2);
        double distanciaV2V3 = calcularDistancia(v2, v3);
        double distanciaV3V1 = calcularDistancia(v3, v1);
        return distanciaV1V2 + distanciaV2V3 + distanciaV3V1;
    }

    public String getTipo() {
        double distanciaV1V2 = calcularDistancia(v1, v2);
        double distanciaV2V3 = calcularDistancia(v2, v3);
        double distanciaV3V1 = calcularDistancia(v3, v1);

        if (distanciaV1V2 == distanciaV2V3 && distanciaV1V2 == distanciaV3V1) {
            return "Equilátero";
        } else if (distanciaV1V2 == distanciaV2V3 || distanciaV1V2 == distanciaV3V1 || distanciaV2V3 == distanciaV3V1) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    private double calcularDistancia(Punto p1, Punto p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    

    @Override
    public String toString() {
        return "Triángulo [V1=" + v1 + ", V2=" + v2 + ", V3=" + v3 + "]";
    }
}
