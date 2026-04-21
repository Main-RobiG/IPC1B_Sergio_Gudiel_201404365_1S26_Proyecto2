package modelo;

import java.io.Serializable;

public class Usuario implements Serializable {
    protected String codigo;
    protected String nombre;
    protected String password;

    public Usuario(String codigo, String nombre, String password) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.password = password;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }
}