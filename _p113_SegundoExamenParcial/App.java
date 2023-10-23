package _p113_SegundoExamenParcial;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Equipo miEquipo = new Equipo("Limones", "Torneo la Bombonera");
        miEquipo.reporte();
        miEquipo.agregarJugador(new JugadorEntrenador("Francisco Zapeda", 'H', "Entrenador Principal", 1000, 8, 1));
        miEquipo.agregarJugador(new JugadorEntrenador("Alexis Estrada", 'H', "Entrenador de Apoyo", 900, 10, 2));
        miEquipo.agregarJugador(new JugadorActivo("Alexander Lopez", 'H', "Principal No 11", 100, 2, 2));
        miEquipo.agregarJugador(new JugadorActivo("Uriel Puga", 'H', "Principal No 16", 100, 3, 1));
        miEquipo.agregarJugador(new JugadorActivo("Alejandra Escalona", 'M', "Principal No 21", 100, 3, 3));
        miEquipo.agregarJugador(new JugadorActivo("Armando Santana", 'H', "Banca No 10", 120, 4, 1));
        miEquipo.agregarJugador(new JugadorActivo("Daniel Mijares", 'H', "Banca No 15", 150, 4, 4));
        miEquipo.agregarJugador(new JugadorActivo("Antonio Hernandez", 'M', "Banca No 20", 350, 5, 3));
        miEquipo.agregarJugador(new JugadorActivo("Andrea Solis", 'M', "Principal No 12", 550, 5, 5));
        miEquipo.agregarJugador(new JugadorActivo("Marissa Hernandez", 'M', "Principal No 12", 600, 4, 2));
        miEquipo.agregarJugador(new JugadorActivo("Diana Soto", 'M', "Principal No 12", 700, 5, 3));
        miEquipo.reporte();
    }
}
