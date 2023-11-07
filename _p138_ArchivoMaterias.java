import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class _p138_ArchivoMaterias {
     public static void main(String[] args) {
        // Pedir al usuario que introduzca la lista de materias
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la lista de materias cursadas (separadas por comas):");
        String inputMaterias = scanner.nextLine();
        
        // Separar las materias introducidas por comas y guardarlas en una lista
        String[] materiasArray = inputMaterias.split(",\\s*");
        ArrayList<String> materias = new ArrayList<>();
        for (String materia : materiasArray) {
            materias.add(materia);
        }

        // Nombre del archivo
        String nombreArchivo = "materias.txt";

        // Escribir la lista de materias en el archivo
        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String materia : materias) {
                bufferedWriter.write(materia);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("La lista de materias ha sido escrita en el archivo.");
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
