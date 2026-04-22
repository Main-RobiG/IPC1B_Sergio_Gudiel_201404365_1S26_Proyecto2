package modelo;

public class Curso {
    
    private String codigo;
    private String nombre;
    private int capacidad;
    private Instructor instructor;
    
    public Curso(String codigo, String nombre, int capacidad, Instructor instructor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.instructor = instructor;
    }

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
}