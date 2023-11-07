package _p139_ArchivoEstudiante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estudiante> estudiantes = new ArrayList<>();

        // Pedir al usuario la lista de estudiantes
        System.out.println("Ingresa los datos de los estudiantes (Nombre, Edad, Promedio, Sexo(M/F)) separados por comas:");
        System.out.println("Escribe 'fin' para terminar la entrada de datos.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fin")) {
                break;
            }

            String[] datosEstudiante = input.split(",\\s*");
            if (datosEstudiante.length == 4) {
                String nombre = datosEstudiante[0];
                int edad = Integer.parseInt(datosEstudiante[1]);
                double promedio = Double.parseDouble(datosEstudiante[2]);
                char sexo = datosEstudiante[3].charAt(0);

                Estudiante nuevoEstudiante = new Estudiante(nombre, edad, promedio, sexo);
                estudiantes.add(nuevoEstudiante);
            } else {
                System.out.println("Error en el formato de entrada. Por favor, ingresa los datos correctamente.");
            }
        }

        // Nombre del archivo
        String nombreArchivo = "estudiantes.txt";

        // Escribir la lista de estudiantes en el archivo
        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Estudiante estudiante : estudiantes) {
                bufferedWriter.write(estudiante.nombre + "," + estudiante.edad + "," + estudiante.promedio + "," + estudiante.sexo);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("La lista de estudiantes ha sido escrita en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        // Leer el archivo y cargar los datos en otro arreglo de estudiantes
        List<Estudiante> estudiantesCargados = new ArrayList<>();
        try {
            File archivo = new File(nombreArchivo);
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] datos = linea.split(",\\s*");
                if (datos.length == 4) {
                    String nombre = datos[0];
                    int edad = Integer.parseInt(datos[1]);
                    double promedio = Double.parseDouble(datos[2]);
                    char sexo = datos[3].charAt(0);

                    Estudiante estudianteCargado = new Estudiante(nombre, edad, promedio, sexo);
                    estudiantesCargados.add(estudianteCargado);
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // Mostrar los datos de los estudiantes cargados
        System.out.println("Estudiantes cargados desde el archivo:");
        for (Estudiante estudiante : estudiantesCargados) {
            System.out.println(estudiante);
        }

        // Cálculo del promedio de calificaciones
        double sumaPromedios = 0;
        for (Estudiante estudiante : estudiantesCargados) {
            sumaPromedios += estudiante.promedio;
        }
        double promedioCalificaciones = sumaPromedios / estudiantesCargados.size();
        System.out.println("Promedio de calificaciones de todos los estudiantes: " + promedioCalificaciones);

        // Cálculo del promedio de edades
        int sumaEdades = 0;
        for (Estudiante estudiante : estudiantesCargados) {
            sumaEdades += estudiante.edad;
        }
        double promedioEdades = (double) sumaEdades / estudiantesCargados.size();
        System.out.println("Promedio de edades de todos los estudiantes: " + promedioEdades);

        // Conteo de la cantidad de hombres y mujeres
        int cantidadHombres = 0;
        int cantidadMujeres = 0;
        for (Estudiante estudiante : estudiantesCargados) {
            if (estudiante.sexo == 'M') {
                cantidadHombres++;
            } else if (estudiante.sexo == 'F') {
                cantidadMujeres++;
            }
        }
        System.out.println("Cantidad de hombres: " + cantidadHombres);
        System.out.println("Cantidad de mujeres: " + cantidadMujeres);
    }
}
