package co.edu.unisabana.ejercicio2Notificaciones;

public class Main {
    public static void main(String[] args){

        Alerta alerta = new Alerta();
        Advertencia advertencia = new Advertencia();
        Confirmacion confirmacion = new Confirmacion();
        Mensaje mensaje = new Mensaje();

        Escritorio escritorio = new Escritorio(alerta);
        Movil movil = new Movil(advertencia);
        Web web = new Web(confirmacion);
        Movil movil2 = new Movil(mensaje);

        escritorio.mostrarNotificacion();
        movil.mostrarNotificacion();
        web.mostrarNotificacion();
        movil2.mostrarNotificacion();
    }
}
