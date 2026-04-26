package modelo;

public class Datos {

    public static Usuario[] usuarios = new Usuario[100];
    public static int contadorUsuarios = 0;

    public static Instructor[] instructor = new Instructor[100];
    public static int contadorInstructor = 0;

    public static Curso[] cursos = new Curso[100];
    public static int contadorCursos = 0;

    public static void agregarInstructor(Usuario u) {
        usuarios[contadorUsuarios] = u;
        contadorUsuarios++;
    }

    public static Instructor buscarInstructor(String codigo) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i] instanceof Instructor &&
                    usuarios[i].getCodigo().equals(codigo)) {
                return (Instructor) usuarios[i];
            }
        }
        return null;
    }

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

    public static boolean existeUsuario(String codigo) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i].getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    public static Usuario buscarPorCodigo(String codigo) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i].getCodigo().equals(codigo)) {
                return usuarios[i];
            }
        }
        return null;
    }

    public static boolean eliminarUsuario(String codigo) {
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

    public static Estudiante buscarEstudiante(String codigo) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i] instanceof Estudiante &&
                    usuarios[i].getCodigo().equals(codigo)) {
                return (Estudiante) usuarios[i];
            }
        }
        return null;
    }
}


