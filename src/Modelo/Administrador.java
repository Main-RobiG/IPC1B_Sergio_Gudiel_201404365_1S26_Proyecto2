package modelo;

public class Administrador extends Usuario {                                    //Administrador usa datos de Usuario

    public Administrador(String codigo, String nombre, String password) {
        super(codigo, nombre, password);                                        
    }
}