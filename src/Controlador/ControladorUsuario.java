package controlador;

import modelo.*;

public class ControladorUsuario {

    public static String obtenerEstudiantes() {
        String lista = "";

        for (int i = 0; i < Datos.contadorUsuarios; i++) {
            if (Datos.usuarios[i] instanceof Estudiante) {
                lista += Datos.usuarios[i].getCodigo() + " - " +
                         Datos.usuarios[i].getNombre() + "\n";
            }
        }

        return lista;
    }
}