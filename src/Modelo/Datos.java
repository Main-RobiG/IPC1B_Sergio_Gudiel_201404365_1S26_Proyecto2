package modelo;

public class Datos {

    public static Usuario[] usuarios = new Usuario[100];
    public static int contadorUsuarios = 0;

    public static void agregarUsuario(Usuario u) {
        usuarios[contadorUsuarios] = u;
        contadorUsuarios++;
    }

    public static Usuario buscarUsuario(String codigo, String password) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i].getCodigo().equals(codigo) &&
                usuarios[i].getPassword().equals(password)) {
                return usuarios[i];
            }
        }
        return null;
    }
}