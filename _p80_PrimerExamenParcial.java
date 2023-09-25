import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        int totalAlumnos = 0;
        int totalDocentes = 0;
        int totalTrabajadores = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int totalParticipantes = 0;
        int totalDineroAlumnos = 0;
        int totalDineroDocentes = 0;
        int totalDineroTrabajadores = 0;

        int edad;
        String sexo;
        String tipoParticipante;

        while (true) {
            System.out.println("Ingrese nombre del participante (o 'fin' para terminar): ");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.println("Ingrese edad: ");
            edad = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Ingrese sexo (H/M): ");
            sexo = scanner.nextLine();

            System.out.println("Ingrese tipo de participante (Alumno: A /Docente: D /Trabajador: T): ");
            tipoParticipante = scanner.nextLine();

            if (edad >= 18) {
                totalParticipantes++;
                switch (tipoParticipante.toLowerCase()) {
                    case "a":
                        totalAlumnos++;
                        totalDineroAlumnos += 50;
                        break;
                    case "d":
                        totalDocentes++;
                        totalDineroDocentes += 80;
                        break;
                    case "t":
                        totalTrabajadores++;
                        totalDineroTrabajadores += 60;
                        break;
                    
                }

                if (sexo.equalsIgnoreCase("h")) {
                    totalHombres++;
                } else if (sexo.equalsIgnoreCase("m")) {
                    totalMujeres++;
                
                }
            } else {
                System.out.println("El participante es menor de edad y no puede asistir al curso.");
            }
        }

        int totalDineroGeneral = totalDineroAlumnos + totalDineroDocentes + totalDineroTrabajadores;
        System.out.println("\n--- Resumen ---");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres en general: " + totalHombres);
        System.out.println("Total de Mujeres en general: " + totalMujeres);
        System.out.println("Total de todos los participantes: " + totalParticipantes);
        System.out.println("Promedio de edad de todos los participantes: " + calcularPromedioEdad(totalParticipantes, scanner));

        System.out.println("\n--- Resumen de Dinero Recaudado ---");
        System.out.println("Total dinero recaudado de Alumnos: $" + totalDineroAlumnos);
        System.out.println("Total dinero recaudado de Docentes: $" + totalDineroDocentes);
        System.out.println("Total dinero recaudado de Trabajadores: $" + totalDineroTrabajadores);
        System.out.println("Total dinero en general: $" + totalDineroGeneral);

        System.out.println("\n--- Mensaje Final ---");
        if (totalDineroGeneral < 100) {
            System.out.println("El evento concluye con ganancias BAJAS");
        } else if (totalDineroGeneral >= 100 && totalDineroGeneral < 200) {
            System.out.println("El evento concluye con ganancias MODERADAS");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias");
        }

        scanner.close();
    }

    public static double calcularPromedioEdad(int totalParticipantes, Scanner scanner) {
        int sumaEdades = 0;
        for (int i = 0; i < totalParticipantes; i++) {
            System.out.println("Ingrese edad del participante " + (i + 1) + ": ");
            int edad = scanner.nextInt();
            sumaEdades += edad;
        }
        return (double) sumaEdades / totalParticipantes;
    }
}
