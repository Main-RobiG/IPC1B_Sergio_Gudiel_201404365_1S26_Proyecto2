package modelo;

public class Datos {

    public static Usuario[] usuarios = new Usuario[100];
    public static int contadorUsuarios = 0;

    public static void agregarUsuario(Usuario u) {                              //Agregar nuevo usuario
        usuarios[contadorUsuarios] = u;
        contadorUsuarios++;
    }
    
    public static Instructor[] instructor = new Instructor[100];
    public static int contadorInstructor = 0;

    public static void agregarInstructor(Usuario u) {                              //Agregar nuevo usuario
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
    
    public static Usuario buscarPorCodigo(String codigo) {                      //metodo para buscar usuarios por codigo
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i].getCodigo().equals(codigo)) {
                return usuarios[i];
            }
        }
        return null;
    }
    
    public static boolean eliminarUsuario(String codigo) {                      //Meetodo para Eliminar Usuarios
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i].getCodigo().equals(codigo)) {

                for (int j = i; j < contadorUsuarios - 1; j++) {
                    usuarios[j] = usuarios[j + 1];
                }
                contadorUsuarios--;
                return true;
            }
        }
        return false;
    }
    
}
