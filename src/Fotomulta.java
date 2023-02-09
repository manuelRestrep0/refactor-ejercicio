public class Fotomulta extends Comparendo{
    public Fotomulta() {
    }

    public void construirFotoMulta(int velocidad, String tipoVehiculo) {
        int calculoTipoComparendo = calcularComparendo(velocidad, tipoVehiculo);
        String correoFotomulta = enviarCorreoFotomulta(tipoVehiculo);
        if(calculoTipoComparendo == -1){
            System.out.println("no hay calculo para el tipo de vehiculo" + tipoVehiculo + "corre: " + correoFotomulta);
        }else {
            System.out.println("----el tipo de comparendo es: " + calculoTipoComparendo + " ----cuerpo del correo" + correoFotomulta);
        }
    }
    public String enviarCorreoFotomulta(String tipoVehiculo) {

        return respuesta(tipoVehiculo);
    }
    private String respuesta(String tipoVehiculo) {
        String cuerpoMensaje = "//enviando correo para el tipo "+tipoVehiculo.toLowerCase();
        String asunto = "//asunto: comparendo "+tipoVehiculo.toLowerCase();
        return   asunto + cuerpoMensaje;
    }
}
