package co.edu.unisabana.ejercicio3Chat;

public class UsuarioChat extends Usuario {

    public UsuarioChat(ChatMediator mediador, String nombre) {
        super(mediador, nombre);
    }

    @Override
    public void enviar(String mensaje) {

        System.out.println("\n" + nombre + " envía: " + mensaje);

        mediador.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibirMensaje(String mensaje) {

        System.out.println(nombre + " recibe: " + mensaje);
    }
}