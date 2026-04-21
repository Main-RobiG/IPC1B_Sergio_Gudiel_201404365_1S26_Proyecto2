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
}