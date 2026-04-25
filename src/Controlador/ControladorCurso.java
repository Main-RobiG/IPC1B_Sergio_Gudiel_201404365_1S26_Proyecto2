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
    
    public static boolean inscribirEstudiante(String codCurso, String codEstudiante) {
        
        Curso c = Datos.buscarCurso(codCurso);
        Estudiante e = Datos.buscarEstudiante(codEstudiante);
        
        if (c == null || e == null) {
            return false;
        }
        return c.agregarEstudiante(e);
    }
    
    public static String verEstudiantesCurso(String codCurso) {
        Curso c = Datos.buscarCurso(codCurso);
        
        if (c != null) {
            return c.listarEstudiantes();
        }
        
        return "Curso no encontrado";
    }
    
    public static boolean asignarNota(String codCurso, String codEst, double nota) {
        
        if (nota < 0 || nota > 100) {
            return false;
        }
        
        Curso c = Datos.buscarCurso(codCurso);
        
        if (c == null) {
            return false;
        }
        return c.asignarNota(codEst, nota);
    }
    
    public static String verNotasCurso(String codCurso) {
        
        Curso c = Datos.buscarCurso(codCurso);
        
        if (c != null) {
            return c.verNotas();
        }
        
        return "Curso no encontrado";
    }
}

