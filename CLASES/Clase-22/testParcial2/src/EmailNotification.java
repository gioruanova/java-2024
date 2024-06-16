
import interfaz.Notificable;

public class EmailNotification implements Notificable {

    private String email;

    public EmailNotification(String msg) {
        this.enviarNotificacion(msg);
        this.email = "test@yahoo.com";
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void enviarNotificacion(String msg) {
        System.out.println("Enviando notificación por " + getEmail() + ": " + msg);
    }

}
