package co.edu.unisabana.ejercicio2Notificaciones;

public class Escritorio extends Plataforma{

    public Escritorio(Notificacion notificacion){
        super(notificacion);
    }

    @Override
    public void mostrarNotificacion() {
        System.out.println("Notificación recibida en el escritorio...");
        System.out.println(notificacion.mostrarNotificacion());
    }
}
