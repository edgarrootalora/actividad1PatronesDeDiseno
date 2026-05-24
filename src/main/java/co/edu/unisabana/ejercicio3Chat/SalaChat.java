package co.edu.unisabana.ejercicio3Chat;

import java.util.ArrayList;
import java.util.List;

public class SalaChat implements ChatMediator {

    private List<Usuario> usuarios;

    public SalaChat() {
        usuarios = new ArrayList<>();
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println(usuario.getNombre() + " se ha unido al chat.");
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario emisor) {

        for (Usuario usuario : usuarios) {

            // No enviar el mensaje al emisor
            if (usuario != emisor) {
                usuario.recibirMensaje(mensaje);
            }
        }
    }
}