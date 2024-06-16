import java.util.List;

public class TorreDeControl {
    private static TorreDeControl instance;
    private String nombre;

    /*
     * Atributos con estados
     */

    private List<Vuelo> vuelos;

    private TorreDeControl() {
        this.nombre = "Torre de Control Norte";
    }

    public static TorreDeControl getInstance() {
        if (instance == null) {
            instance = new TorreDeControl();
        }
        return instance;
    }

    public void agregarVuelos(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }

    public String getNombre() {
        return nombre;
    }

}
