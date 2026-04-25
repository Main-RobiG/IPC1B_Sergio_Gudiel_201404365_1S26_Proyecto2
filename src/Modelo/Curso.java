package modelo;

import java.io.Serializable;

public class Curso implements Serializable {
    
    private String codigo;
    private String nombre;
    private int capacidad;
    private Instructor instructor;
    private Estudiante[] estudiantes = new Estudiante[50];                      //50 estudiantes por curso
    private int contadorEstudiantes = 0;
    private double[] notas = new double[50];
    
    public Curso(String codigo, String nombre, int capacidad, Instructor instructor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.instructor = instructor;
    }
    
//-------------------------------------------------------------------------------
    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    
//--------------------------------------------------------------------------------    
    
    public boolean agregarEstudiante(Estudiante e) {
        
        for (int i = 0; i < contadorEstudiantes; i++) {                         //comprueba duplicados
            if (estudiantes[i].getCodigo().equals(e.getCodigo())) {
                return false;
            }
        }
        
        if (contadorEstudiantes < capacidad) {                                  //comprueba capacidad del vector
            estudiantes[contadorEstudiantes] = e;
            notas[contadorEstudiantes]=0;                                       //nota inicial 0
            contadorEstudiantes++;
            return true;
        }
        return false;
    }
    
    public String listarEstudiantes() {
        String lista = "";
        
        for (int i = 0; i < contadorEstudiantes; i++) {
            lista += estudiantes[i].getCodigo() + " - " +
                    estudiantes[i].getNombre() + "\n";
        }

    return lista;
    }
    
    public boolean asignarNota(String codEstudiante, double nota) {             //metodo para asignar notas
        
        for (int i = 0; i < contadorEstudiantes; i++) {
            if (estudiantes[i].getCodigo().equals(codEstudiante)) {
                notas[i] = nota;
                return true;
            }
        }
        
        return false;
    }
    
    public String verNotas() {                                                  //metodo para ver notas
        String lista = "";
        
        for (int i = 0; i < contadorEstudiantes; i++) {
            lista += estudiantes[i].getCodigo() + " - " +
                    estudiantes[i].getNombre() + " | Nota: " +
                    notas[i] + "\n";
        }    
        return lista;
    }
 //-------------------------------------------------------------------------------   
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }
    
    public double[] getNotas() {
    return notas;
    }
    
    public int getContadorEstudiantes() {
        return contadorEstudiantes;
    }
}