package co.edu.unisabana.ejercicio3Chat;

public abstract class Usuario {

    protected ChatMediator mediador;
    protected String nombre;

    public Usuario(ChatMediator mediador, String nombre) {
        this.mediador = mediador;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void enviar(String mensaje);

    public abstract void recibirMensaje(String mensaje);
}