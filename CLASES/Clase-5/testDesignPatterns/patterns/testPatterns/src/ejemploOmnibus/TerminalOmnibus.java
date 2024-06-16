package ejemploOmnibus;

import java.util.ArrayList;
import java.util.List;

public class TerminalOmnibus {

    private static TerminalOmnibus instancia;

    private List<Autobus> autobuses;

    private TerminalOmnibus() {
        this.autobuses = new ArrayList<>();
    }

    public static TerminalOmnibus obtenerInstancia() {
        if (instancia == null) {
            instancia = new TerminalOmnibus();
        } else {
            System.out.println("Ya existe una instancia de TerminalOmnibus");
        }
        return instancia;
    }

    public void agregarAutobus(Autobus autobus) {
        autobuses.add(autobus);
        System.out.println("Se ha agregado un autobús a la terminal.");
    }

    public void listarAutobuses() {
        System.out.println("Autobuses en la terminal:");
        for (Autobus autobus : autobuses) {
            System.out.println("- ID: " + autobus.getId());
        }
    }
}
