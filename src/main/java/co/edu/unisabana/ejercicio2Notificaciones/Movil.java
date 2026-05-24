package co.edu.unisabana.ejercicio2Notificaciones;

public class Movil extends Plataforma{

    public Movil(Notificacion notificacion){
        super(notificacion);
    }

    @Override
    public void mostrarNotificacion() {
        System.out.println("Notificación recibida en el movil...");
        System.out.println(notificacion.mostrarNotificacion());
    }
}
