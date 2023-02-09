public class Comparendo {

    private int limiteInferiorCarro = 65;
    private int limiteInferiorIntermedioCarro = 66;
    private int limiteSuperiorCarro = 85;
    private int limiteInferiorCamion = 75;
    private int limiteInferiorIntermedioCamion = 76;
    private int limiteSuperiorCamion = 95;
    private int limiteInferiorMula = 95;
    private int limiteInferiorIntermedioMula = 96;
    private int limiteSuperiorMula = 110;

    public Comparendo() {
    }

    public int calcularComparendo(int velocidad, String tipoVehiculo) {

        if(tipoVehiculo == "CARRO") {
            return verificarVelocidad(velocidad,limiteInferiorCarro, limiteInferiorIntermedioCarro, limiteSuperiorCarro);
        }
        if(tipoVehiculo == "CAMION") {
            return verificarVelocidad(velocidad, limiteInferiorCamion, limiteInferiorIntermedioCamion, limiteSuperiorCamion);
        }
        if(tipoVehiculo == "MULA") {
            return verificarVelocidad(velocidad, limiteInferiorMula, limiteInferiorIntermedioMula, limiteSuperiorMula);
        }
        return -1;
    }
    private int verificarVelocidad(int velocidadVehiculo, int limiteVelocidadInferior, int limiteVelocidadInferiorIntermedio, int limiteVelocidadSuperior){
        if(velocidadVehiculo<=limiteVelocidadInferior){
            return 0;
        } else if(velocidadVehiculo>= limiteVelocidadInferiorIntermedio && velocidadVehiculo<=limiteVelocidadSuperior){
            return 1;
        }
        return 2;
    }




}
