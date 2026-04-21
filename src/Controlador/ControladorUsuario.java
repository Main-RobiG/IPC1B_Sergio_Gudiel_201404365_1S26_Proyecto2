package controlador;

import modelo.*;

public class ControladorUsuario {

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
    
    
}