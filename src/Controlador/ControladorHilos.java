package controlador;

import modelo.Datos;
import modelo.Instructor;
import modelo.Estudiante;

public class ControladorHilos {

    private static volatile boolean activo = false;

    private static Thread hiloSesiones;                                         // Hilo 1: Monitor de sesiones activas
    private static Thread hiloInscripciones;                                    // Hilo 2: Inscripciones pendientes
    private static Thread hiloEstadisticas;                                     // Hilo 3: Estadísticas académicas

    public static int usuariosActivos = 0;                                      // Contador de usuarios activos (se incrementa al hacer login)
    public static int inscripcionesPendientes = 0;                               // Contador de inscripciones en proceso

    public static void iniciar() {
        activo = true;

        hiloSesiones = new Thread(() -> {
            while (activo) {
                try {
                    Thread.sleep(10000);
                    String msg = "[Thread-Sesiones] Usuarios Activos: " + usuariosActivos +
                            " - Última actividad: " + new java.util.Date();
                    System.out.println(msg);
                } catch (InterruptedException e) {
                    System.out.println("[Thread-Sesiones] Detenido");
                }
            }
        });

        hiloInscripciones = new Thread(() -> {
            while (activo) {
                try {
                    Thread.sleep(8000);
                    String msg = "[Thread-Inscripciones] Inscripciones Pendientes: " +
                            inscripcionesPendientes + " - Procesando... " + new java.util.Date();
                    System.out.println(msg);
                } catch (InterruptedException e) {
                    System.out.println("[Thread-Inscripciones] Detenido");
                }
            }
        });

        hiloEstadisticas = new Thread(() -> {
            while (activo) {
                try {
                    Thread.sleep(15000);
                    // Contar instructores y estudiantes
                    int numInstructores = 0, numEstudiantes = 0;
                    for (int i = 0; i < Datos.contadorUsuarios; i++) {
                        if (Datos.usuarios[i] instanceof Instructor) numInstructores++;
                        if (Datos.usuarios[i] instanceof Estudiante) numEstudiantes++;
                    }
                    String msg = "[Thread-Estadísticas] Cursos Activos: " + Datos.contadorCursos +
                            " | Estudiantes Registrados: " + numEstudiantes +
                            " | Instructores: " + numInstructores +
                            " | " + new java.util.Date();
                    System.out.println(msg);
                } catch (InterruptedException e) {
                    System.out.println("[Thread-Estadísticas] Detenido");
                }
            }
        });

        hiloSesiones.setDaemon(true);
        hiloInscripciones.setDaemon(true);
        hiloEstadisticas.setDaemon(true);

        hiloSesiones.start();
        hiloInscripciones.start();
        hiloEstadisticas.start();
    }

    public static void detener() {
        activo = false;
        if (hiloSesiones != null) hiloSesiones.interrupt();
        if (hiloInscripciones != null) hiloInscripciones.interrupt();
        if (hiloEstadisticas != null) hiloEstadisticas.interrupt();
    }
}