
import interfaz.Notificable;

public class SmsNotification implements Notificable {
    private String numeroTelefono;

    public SmsNotification(String mensaje) {
        this.numeroTelefono = "1123456789";
        this.enviarNotificacion(mensaje);
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando SMS al " + getNumeroTelefono() + ": " + mensaje);
    }
}
