import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _p137_ArchivoMunicipios {
     public static void main(String[] args) {
        // Nombre del archivo
        String nombreArchivo = "deportes.txt";

        // Lista de deportes
        String[] deportes = {
            "Fútbol",
            "Béisbol",
            "Ciclismo",
            "Atletismo",
            "Natación",
            "Motociclismo"
        };

        // Escribir la lista de deportes en el archivo
        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String deporte : deportes) {
                bufferedWriter.write(deporte);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Los datos han sido escritos en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        // Leer el archivo y mostrar los datos
        try {
            File archivo = new File(nombreArchivo);
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            System.out.println("Leyendo datos del archivo:");
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
