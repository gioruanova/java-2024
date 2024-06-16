import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CargarJugador {

    public List<Jugador> cargarTodosLosJugadores(String archivoJugadores) {
        try {
            /*
             * Simulación de carga de jugadores desde un archivo
             * Simulamos un NullPointerException
             */
            throw new NullPointerException("Simulación de error no chequeado");
        } catch (NullPointerException e) {
            // Lanzamos una excepción no chequeada (unchecked) para notificar el error
            throw new ExcepcionCargaJugador(e);
        }
    }

    // Definición de una excepción no chequeada personalizada (unchecked exception)
    public static class ExcepcionCargaJugador extends RuntimeException {
        public ExcepcionCargaJugador(Throwable causa) {
            super("Error al cargar jugadores", causa);
        }
    }

    // Clase de ejemplo para representar un jugador
    public static class Jugador {
        // Atributos y métodos de la clase Jugador
    }

    public static void main(String[] args) {
        CargarJugador cargador = new CargarJugador();
        try {
            List<Jugador> jugadores = cargador.cargarTodosLosJugadores("archivo.txt");
            System.out.println("Jugadores cargados correctamente");
        } catch (ExcepcionCargaJugador e) {
            System.out.println("Error al cargar jugadores: " + e.getMessage());
            System.out.println("Causa del error: " + e.getCause().getMessage());
        }
    }
}
