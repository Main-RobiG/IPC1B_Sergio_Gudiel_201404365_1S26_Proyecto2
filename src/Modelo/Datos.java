package modelo;

public class Datos {

//------------------------------------INSTRUCTOR--------------------------------
   
    public static Instructor[] instructor = new Instructor[100];
    public static int contadorInstructor = 0;

    public static void agregarInstructor(Usuario u) {                           //constructor Instructor
        usuarios[contadorUsuarios] = u;
        contadorUsuarios++;
    }
    
    public static Instructor buscarInstructor(String codigo) {                  //Buscar Instructor
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i] instanceof Instructor &&
                    usuarios[i].getCodigo().equals(codigo)) {
                return (Instructor) usuarios[i];
            }
        }
        return null;
    }    

//--------------------------------USUARIO---------------------------------------
        
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
//----------------------------------------CURSOS------------------------------------   
    
    public static Curso[] cursos = new Curso[100];                              //constructor de los cursos
    public static int contadorCursos = 0;
    
    public static void agregarCurso(Curso c) {
        cursos[contadorCursos] = c;
        contadorCursos++;
    }
    
    public static Curso buscarCurso(String codigo) {
        for (int i = 0; i < contadorCursos; i++) {
            if (cursos[i].getCodigo().equals(codigo)) {
                return cursos[i];
            }
        }
        return null;
    }
//------------------------------------Estudiantes-------------------------------

    public static Estudiante buscarEstudiante(String codigo) {                  //Mmetodo para buscar estudiantes
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i] instanceof Estudiante &&
                    usuarios[i].getCodigo().equals(codigo)) {
                return (Estudiante) usuarios[i];
            }
        }
        return null;
    }
    
    

    
    
}


