package ejemploLogger;

public class Main {
    public static void main(String[] args) {
        // Obtengo mi unica instancia de logger
        Logger logger = Logger.obtenerInstancia();

        // Vamos a agregar eventos
        logger.registrarEvento("Inicio de la aplicación");
        logger.registrarEvento("Carga de datos");
        logger.registrarEvento("Error al registrar datos");
        logger.registrarEvento("Cierre de la aplicación");

    }
}
