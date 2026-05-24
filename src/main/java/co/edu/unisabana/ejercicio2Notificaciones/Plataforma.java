package co.edu.unisabana.ejercicio2Notificaciones;

public abstract class Plataforma {

    protected Notificacion notificacion;

    public Plataforma(Notificacion notificacion){
        this.notificacion = notificacion;
    }

    public abstract void mostrarNotificacion();
}
