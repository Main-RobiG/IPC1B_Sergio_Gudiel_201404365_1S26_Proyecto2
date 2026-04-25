package controlador;

import java.io.*;
import modelo.*;

public class ControladorSerializador {

    public static void guardarDatos(String ruta) {

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));

            out.writeObject(Datos.usuarios);
            out.writeObject(Datos.cursos);
            out.writeInt(Datos.contadorUsuarios);
            out.writeInt(Datos.contadorCursos);

            out.close();

            System.out.println("Datos guardados");

        } catch (IOException e) {
            System.out.println("Error al guardar");
        }
    }

    public static void cargarDatos(String ruta) {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta));

            Datos.usuarios = (Usuario[]) in.readObject();
            Datos.cursos = (Curso[]) in.readObject();
            Datos.contadorUsuarios = in.readInt();
            Datos.contadorCursos = in.readInt();

            in.close();

            System.out.println("Datos cargados");

        } catch (Exception e) {
            System.out.println("No hay datos previos o error");
        }
    }
}