package _p119_Organismo._p120_Vehiculo;

public class Suv extends Maquina implements Veiculo, TodoTerreno {
    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automóvil con sistema eléctrico es una Suv");
    }

    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil de combustión interna es una Suv");
    }

    @Override
    public void traccion4x4() {
        System.out.println("Es un automóvil con tracción 4 x 4 es una Suv");
    }

    @Override
    public void chasisIndependiente() {
        System.out.println("Es un automóvil con chasis independiente es una Suv");
    }
}
