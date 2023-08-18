// Manda un saludo a la pantalla 
public class _p01_HolaMundo {
    public static void main(String[] args) {
        String amigo = "Byayan";
        String hermano = "Oscar";
        String mensaje = String.format("Tanto %s como %s desea aprender java", amigo, hermano);
        System.out.println("Hloa Mundo");
        System.out.println("\nHola amigo " + amigo + " bienvenido a java");
        System.out.println("\nHola amigo " + amigo + " mi hermano es " + hermano);
        System.out.println("\n " + mensaje);

    }
}