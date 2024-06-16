public interface Notificable {

    void enviarCorreoElectronico(String destinatario, String mensaje);

    void enviarMensajeTexto(String destinatario, String mensaje);

    void enviarNotificacionPush(String destinatario, String mensaje);
}
