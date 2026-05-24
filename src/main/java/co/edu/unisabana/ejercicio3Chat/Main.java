package co.edu.unisabana.ejercicio3Chat;

public class Main {

    public static void main(String[] args) {

        SalaChat sala = new SalaChat();

        Usuario usuario1 = new UsuarioChat(sala, "Ana");
        Usuario usuario2 = new UsuarioChat(sala, "Carlos");
        Usuario usuario3 = new UsuarioChat(sala, "Laura");

        sala.agregarUsuario(usuario1);
        sala.agregarUsuario(usuario2);
        sala.agregarUsuario(usuario3);

        usuario1.enviar("Hola a todos!");
        usuario2.enviar("Hola Ana, ¿cómo estás?");
        usuario3.enviar("Bienvenidos al grupo.");
    }
}