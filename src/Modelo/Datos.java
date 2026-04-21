package modelo;

public class Datos {

    public static Usuario[] usuarios = new Usuario[100];
    public static int contadorUsuarios = 0;

    public static void agregarUsuario(Usuario u) {                              //Agregar nuevo usuario
        usuarios[contadorUsuarios] = u;
        contadorUsuarios++;
    }

    public static Usuario buscarUsuario(String codigo, String password) {       //Busca Usuario Agregado
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i].getCodigo().equals(codigo) &&
                usuarios[i].getPassword().equals(password)) {
                return usuarios[i];
            }
        }
        return null;
    } 
    
    public static boolean existeUsuario(String codigo) {                        //Comprueba Existencia de Usuario
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i].getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }
}