package ejemploOmnibus;

import java.util.Random;

public class MainAutobus {

    public static void main(String[] args) {
        // Obtener la instancia única de TerminalOmnibus
        Random id = new Random();
        TerminalOmnibus terminal = TerminalOmnibus.obtenerInstancia();
        TerminalOmnibus nuevaTerminal = TerminalOmnibus.obtenerInstancia();

        // Crear algunos autobuses y agregarlos a la terminal
        Autobus autobus1 = new Autobus(Math.abs(id.nextInt(1000)));
        Autobus autobus2 = new Autobus(Math.abs(id.nextInt(1000)));

        terminal.agregarAutobus(autobus1);
        terminal.agregarAutobus(autobus2);

        // Listar los autobuses en la terminal
        terminal.listarAutobuses();

    }

}
