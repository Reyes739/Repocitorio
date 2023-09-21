import java.util.Scanner;

public class _p79_Angulo {
     public static String obtenerTipoAngulo(double angulo) {
        if (angulo < 0 || angulo > 360) {
            return "Ángulo inválido";
        }
        
        String tipo = "";
        
        // Utilizamos switch para determinar el tipo de ángulo
        switch ((int) angulo) {
            case 0:
            case 360:
                tipo = "Ángulo nulo";
                break;
            case 90:
                tipo = "Ángulo recto";
                break;
            case 180:
                tipo = "Ángulo llano";
                break;
            default:
                if (angulo > 0 && angulo < 90) {
                    tipo = "Ángulo agudo";
                } else if (angulo > 90 && angulo < 180) {
                    tipo = "Ángulo obtuso";
                } else if (angulo > 180 && angulo < 360) {
                    tipo = "Ángulo cóncavo";
                }
                break;
        }
        
        return tipo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un ángulo entre 0 y 360 grados: ");
        double angulo = scanner.nextDouble();

        String tipoAngulo = obtenerTipoAngulo(angulo);
        System.out.println("El ángulo es de tipo " + tipoAngulo);

        
    }
}
