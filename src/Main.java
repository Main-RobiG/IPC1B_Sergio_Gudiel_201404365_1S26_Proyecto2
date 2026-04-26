import vista.Login;
import modelo.Administrador;
import modelo.Datos;
import controlador.ControladorSerializador;
import controlador.ControladorHilos;

public class Main {
    public static void main(String[] args) {

        ControladorSerializador.cargarDatos("datos.ser");

        // Solo agregar admin si no existe ya (por si se cargó del .ser)
        if (Datos.buscarPorCodigo("admin") == null) {
            Administrador admin = new Administrador("admin", "Admin", "IPC1B");
            Datos.agregarUsuario(admin);
        }

        ControladorHilos.iniciar();

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
}