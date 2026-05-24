package co.edu.unisabana.ejercicio2Notificaciones;

public class Web extends Plataforma{

    public Web(Notificacion notificacion){
        super(notificacion);
    }

    @Override
    public void mostrarNotificacion() {
        System.out.println("Notificación recibida en web...");
        System.out.println(notificacion.mostrarNotificacion());
    }
}
