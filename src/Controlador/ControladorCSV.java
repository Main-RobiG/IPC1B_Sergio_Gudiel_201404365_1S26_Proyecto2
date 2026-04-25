package controlador;

import java.io.FileWriter;
import java.io.IOException;
import modelo.*;

public class ControladorCSV {

    public static void exportarNotasCurso(String codCurso, String ruta) {

        Curso c = Datos.buscarCurso(codCurso);

        if (c == null) {
            System.out.println("Curso no encontrado");
            return;
        }

        try {
            FileWriter writer = new FileWriter(ruta);

            writer.write("Codigo,Nombre,Nota\n");

            for (int i = 0; i < c.getContadorEstudiantes(); i++) {

                writer.write(
                    c.getEstudiantes()[i].getCodigo() + "," +
                    c.getEstudiantes()[i].getNombre() + "," +
                    c.getNotas()[i] + "\n"
                );
            }

            writer.close();

            System.out.println("Archivo CSV generado");

        } catch (IOException e) {
            System.out.println("Error al escribir archivo");
        }
    }
}