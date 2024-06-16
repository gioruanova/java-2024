import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import interfaz.Notificable;

public class App {
    public static void main(String[] args) throws Exception {

        FabricaDeMuebles<Mueble> fabrica = new FabricaDeMuebles<>("Fabrica de Muebles");

        // fabrica.addNotificacion(new SmsNotification("1131445166"));

        Mesa mesa = new Mesa("Mesa Moderna", 100.0, 20.0, 120, 60, "Moderna");
        Silla silla = new Silla("Silla de Madera", 50.0, 15.0, 90, "Madera");
        Sillon sillon = new Sillon("Sillón de Cuero", 200.0, 25.0, 3, "Cuero");

        fabrica.addNotificacion(new SmsNotification("Se ha fabricado el mueble: " + mesa.modelo));

        fabrica.fabricar(mesa);
        fabrica.fabricar(silla);
        fabrica.fabricar(sillon);

        List<String> emails = new ArrayList<>();
        Notificable email = new EmailNotification("asd");

        fabrica.mostrar();

    }
}
