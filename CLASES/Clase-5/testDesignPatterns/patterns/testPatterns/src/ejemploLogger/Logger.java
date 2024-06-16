package ejemploLogger;

import java.util.Date;

public class Logger {
    private static Logger instancia;

    private Logger() {
    }

    public static Logger obtenerInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void registrarEvento(String mensaje) {
        System.out.println(new Date() + ": " + mensaje);
    }
}
