package controlador;

public class ControladorHilos extends Thread {

    @Override
    public void run() {

        while (true) {
            try {
                // esperar 30 segundos
                Thread.sleep(30000);

                // guardar datos
                ControladorSerializador.guardarDatos("datos.ser");

                System.out.println("Auto-guardado ejecutado");

            } catch (InterruptedException e) {
                System.out.println("Hilo detenido");
            }
        }
    }
}