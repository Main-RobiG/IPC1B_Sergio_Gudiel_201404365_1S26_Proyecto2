package controlador;

import modelo.*;

public class ControladorUsuario {

    public static boolean crearEstudiante(String codigo, String nombre, String password){ // Controlador de Crear un Estudiante
        
        if (codigo == null || codigo.isEmpty() ||
                nombre == null || nombre.isEmpty() ||
                password == null || password.isEmpty()) {
            return false;
        }
        
        if (!Datos.existeUsuario(codigo)) {
            Estudiante e = new Estudiante(codigo, nombre, password);
            Datos.agregarUsuario(e);
            return true;
        }
        return false;
        
    }
    
    public static String obtenerEstudiantes() {                                 //Controlador Mostrar Estidiantes
        String lista = "";

        for (int i = 0; i < Datos.contadorUsuarios; i++) {
            if (Datos.usuarios[i] instanceof Estudiante) {
                lista += Datos.usuarios[i].getCodigo() + " - " +
                         Datos.usuarios[i].getNombre() + "\n";
            }
        }

        return lista;
    }
    
    public static boolean editarEstudiante(String codigo, String nuevoNombre, String nuevoPass){ //Controlador Editar estudiantes {
        Usuario u = Datos.buscarPorCodigo(codigo);
        
        if (u != null && u instanceof Estudiante) {
            
            u.setNombre(nuevoNombre);
            u.setPassword(nuevoPass);
            return true;
        }
        return false;
    }
    
    public static boolean eliminarEstudiante(String codigo) {                   //Controlador Eliminar Estudiante
        Usuario u = Datos.buscarPorCodigo(codigo);
        
        if (u != null && u instanceof Estudiante) {
            return Datos.eliminarUsuario(codigo);
        }
        
        return false;
    }
    
    public static boolean crearInstructor(String codigo, String nombre, String password){ // Controlador de Crear un instructor
        
        if (!Datos.existeUsuario(codigo)) {
            Instructor i = new Instructor(codigo, nombre, password);
            Datos.agregarUsuario(i);
            return true;
        }
        return false;
    }
    
    public static String obtenerInstructores() {                                //Metodo para buscar instructores
        String lista = "";
        
        for (int i = 0; i < Datos.contadorUsuarios; i++) {
            
            if (Datos.usuarios[i] instanceof Instructor) {
                lista += Datos.usuarios[i].getCodigo() + " - " +
                        Datos.usuarios[i].getNombre() + "\n";
            }
        }
        return lista;
    }
    
    public static boolean editarInstructor(String codigo, String nombre, String pass) {
        Usuario u = Datos.buscarPorCodigo(codigo);
        
        if (u != null && u instanceof Instructor) {
            u.setNombre(nombre);
            u.setPassword(pass);
            return true;
        }
        return false;
    }
    
    public static boolean eliminarInstructor(String codigo) {                   //metodo para eliminar instructor
        Usuario u = Datos.buscarPorCodigo(codigo);
        
        if (u != null && u instanceof Instructor) {
            return Datos.eliminarUsuario(codigo);
        }
        return false;
    }
    
    public static Estudiante obtenerEstudiante(String codigo) {                 //metodo para obtener 1 estudiante
        return Datos.buscarEstudiante(codigo);
    }
    
    public static Instructor obtenerInstructor(String codigo) {                 //metodo para obtener 1 Instructor
        return Datos.buscarInstructor(codigo);
    }
    
    public static String[] obtenerCodigosInstructores() {
        
        int contador = 0;
        
        for (int i = 0; i < Datos.contadorUsuarios; i++) {
            if (Datos.usuarios[i] instanceof Instructor) {
                contador++;
            }
        }
        
        String[] lista = new String[contador];
        
        int j = 0;
        
        for (int i = 0; i < Datos.contadorUsuarios; i++) {
            if (Datos.usuarios[i] instanceof Instructor) {
                lista[j++] = Datos.usuarios[i].getCodigo();
            }
        }
        
        return lista;
    }
}