@FunctionalInterface
public interface Notificador {

    public final String TEXTO = "Enviando mensaje a ";

    void enviarNotificacion(String destinatario, String mensaje);
}
