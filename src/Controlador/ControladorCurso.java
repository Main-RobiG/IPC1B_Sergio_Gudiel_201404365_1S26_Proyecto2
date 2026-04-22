package controlador;

import modelo.*;

public class ControladorCurso {
    
    public static boolean crearCurso(String codigo, String nombre, int capacidad, String codInstructor) {
        
        if (capacidad <= 0) {
            return false;
        }
        
        if (Datos.buscarCurso(codigo) != null) {
            return false;
        }
        
        Instructor inst = Datos.buscarInstructor(codInstructor);
        
        if (inst == null) {
            return false;
        }
        
        Curso c = new Curso(codigo, nombre, capacidad, inst);
        Datos.agregarCurso(c);
        
        return true;
    }

    public static String obtenerCursos() {
        String lista = "";
        
        for (int i = 0; i < Datos.contadorCursos; i++) {
            Curso c = Datos.cursos[i];
            
            lista += c.getCodigo() + " - " +
                    c.getNombre() + " | Catedratico: " +
                    c.getInstructor().getNombre() + "\n";
        }
        return lista;
    }
}