package _p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;

public class Util {
    private static final String NOMBRE_ARCHIVO = "jugadores.dat";

    public static ArrayList<Jugador> inicializarDatos() {
        return new ArrayList<>();
    }

    public static void serializarDatos(ArrayList<Jugador> jugadores) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            out.writeObject(jugadores);
        }
    }

    public static ArrayList<Jugador> desSerializarDatos() throws IOException, ClassNotFoundException {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))) {
            jugadores = (ArrayList<Jugador>) in.readObject();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("No se encontró el archivo: " + NOMBRE_ARCHIVO);
        } catch (IOException | ClassNotFoundException e) {
            throw new IOException("Error al leer el archivo: " + e.getMessage());
        }
        return jugadores;
    }
}