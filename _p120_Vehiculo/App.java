package _p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Sedan sedan = new Sedan();
        System.out.println("Maquina [Nombre=Vochito, Propietario=Maria Diaz, Pasajeros=4]");
        System.out.println("Características del Sedan:");
        sedan.sistemaElectrico();
        sedan.combustionInterna();
        sedan.carroceriaTresPartes();
        sedan.chasisMonocasco();
        sedan.repostar();
        sedan.arrancar();
        sedan.frenar();

        System.out.println();

        Suv suv = new Suv();
        System.out.println("Maquina [Nombre=La mamalona, Propietario=Carlos Castaneda, Pasajeros=6]");
        System.out.println("Características del SUV:");
        suv.sistemaElectrico();
        suv.combustionInterna();
        suv.traccion4x4();
        suv.chasisIndependiente();
        suv.repostar();
        suv.arrancar();
        suv.frenar();
    }
}
