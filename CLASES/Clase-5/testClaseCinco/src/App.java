import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("Ana", 85));
        estudiantes.add(new Estudiante("Juan", 75));
        estudiantes.add(new Estudiante("María", 95));
        estudiantes.add(new Estudiante("Pedro", 65));

        /*
         * Con clase anonima
         */
        FiltroEstudiante filtroConClaseAnonima = new FiltroEstudiante() {
            @Override
            public boolean filtrar(Estudiante estudiante) {
                return estudiante.getCalificacion() > 80;
            }
        };
        /*
         * Con lambda
         */
        FiltroEstudiante filtroCalificacionAlta = estudiante -> estudiante.getCalificacion() > 80;

        /*
         * Resultados: hacen exactamente lo mismo
         */
        estudiantes.stream()
                .filter(v -> filtroConClaseAnonima.filtrar(v))
                .forEach(estudiante -> System.out.println(estudiante.getNombre()));

        Notificador correoElectronico = (destinatario, mensaje) -> {
            System.out.println("Enviando correo electrónico a " + destinatario + ": " + mensaje);
            // Lógica para enviar el correo electrónico...
        };

        Notificador mensajeTexto = (destinatario, mensaje) -> {
            System.out.println("Enviando mensaje de texto a " + destinatario + ": " + mensaje);
            // Lógica para enviar el mensaje de texto...
        };

        Notificador notificacionPush = (destinatario, mensaje) -> {
            System.out.println("Enviando notificación push a " + destinatario + ": " + mensaje);
            // Lógica para enviar la notificación push...
        };

        correoElectronico.enviarNotificacion("usuario@example.com", "¡Bienvenido a nuestra plataforma!");
        mensajeTexto.enviarNotificacion("+123456789", "Recuerda tu cita mañana a las 10 AM");
        notificacionPush.enviarNotificacion("dispositivo-id", "Nuevo mensaje en tu bandeja de entrada");

        OperacionesEstudiante imprimirCalificacion = new OperacionesEstudiante() {

            @Override
            protected void operacion(Estudiante estudiante) {
                System.out.println("Calificaion de " + estudiante.getNombre() + ": " + estudiante.getCalificacion());
            }

        };

        imprimirCalificacion.ejecutarOperacion(estudiantes);

        Profesor profesor = new Profesor("Fernando", " Valls");

        profesor.enviarCorreoElectronico("usuario@davinci.edu.ar", "¡Bienvenido a nuestra plataforma!");
        profesor.enviarMensajeTexto("+123456789", "Recuerda tu cita mañana a las 10 AM");
        // profesor.enviarNotificacionPush("dispositivo-id", "Nuevo mensaje en tu
        // bandeja de entrada");
    }
}
