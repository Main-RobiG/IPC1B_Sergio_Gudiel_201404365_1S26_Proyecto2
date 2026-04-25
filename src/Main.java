import vista.Login;

import modelo.Administrador;
import modelo.Datos;
import controlador.ControladorSerializador;
import controlador.ControladorHilos;

public class Main {
    public static void main(String[] args) {
        
        ControladorSerializador.cargarDatos("datos.ser");
       
        Administrador admin = new Administrador("admin", "Admin", "IPC1B");     //Admin para prueba
        Datos.agregarUsuario(admin);

        ControladorHilos hilo = new ControladorHilos();
        hilo.start();
        
        Login login = new Login();                                              //Ventana de Login
        login.setVisible(true);
    }
}