package controlador;

import modelo.Datos;
import modelo.Usuario;

public class ControladorLogin {

    public static Usuario login(String codigo, String password) {
        return Datos.buscarUsuario(codigo, password);
    }
}