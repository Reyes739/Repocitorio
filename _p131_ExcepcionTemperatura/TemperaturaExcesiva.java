package _p131_ExcepcionTemperatura;

class TemperaturaExcesiva extends Exception {
    public TemperaturaExcesiva(String mensaje) {
        super(mensaje);
    }
}