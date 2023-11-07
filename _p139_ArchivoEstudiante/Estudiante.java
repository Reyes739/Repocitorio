package _p139_ArchivoEstudiante;

class Estudiante {
    String nombre;
    int edad;
    double promedio;
    char sexo;

    public Estudiante(String nombre, int edad, double promedio, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Promedio: " + promedio + ", Sexo: " + sexo;
    }
}
