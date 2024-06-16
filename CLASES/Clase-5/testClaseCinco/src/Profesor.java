import java.util.ArrayList;
import java.util.List;

public class Profesor implements Notificador {

    private String nombre;
    private String apellido;
    private List<Estudiante> estudiantes;

    public Profesor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public void enviarNotificacion(String destinatario, String mensaje) {
        System.out.println(Notificador.TEXTO + destinatario + ": " +
                mensaje);
    }

    public void enviarCorreoElectronico(String destinatario, String mensaje) {
        this.enviarNotificacion(destinatario, mensaje);
        // Lógica para enviar el correo electrónico...
    }

    public void enviarMensajeTexto(String destinatario, String mensaje) {
        this.enviarNotificacion(destinatario, mensaje);
        // Lógica para enviar el mensaje de texto...
    }

    // @Override
    // public void enviarCorreoElectronico(String destinatario, String mensaje) {
    // System.out.println("Enviando correo electrónico a " + destinatario + ": " +
    // mensaje);
    // Lógica para enviar el correo electrónico...
    // }

    // @Override
    // public void enviarMensajeTexto(String destinatario, String mensaje) {
    // System.out.println("Enviando mensaje de texto a " + destinatario + ": " +
    // mensaje);
    // // Lógica para enviar el mensaje de texto...
    // }

    // @Override
    public void enviarNotificacionPush(String destinatario, String mensaje) {
        System.out.println("Enviando correo electrónico a " + destinatario + ": " +
                mensaje);
        // Lógica para enviar el correo electrónico...
    }

}
