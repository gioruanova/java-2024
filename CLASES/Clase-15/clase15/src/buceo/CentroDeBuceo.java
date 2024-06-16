package buceo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import buceo.excepciones.ErroresReserva;

public class CentroDeBuceo {

    /*
     * Singleton
     */

    private static CentroDeBuceo instance;
    private String nombre;
    private List<ErroresReserva> erroresReserva;
    private HashMap<Buzo, Buceo> buzosResgistrados;
    private HashMap<Buceo, Mes> buceosRegistrados;
    private ListaBuceosPorId<Buceo> buceosDisponibles;

    private CentroDeBuceo(String nombre) {
        this.buceosDisponibles = new ListaBuceosPorId();
        this.nombre = nombre;
        this.buceosRegistrados = new HashMap<>();
        this.buzosResgistrados = new HashMap<>();
        this.erroresReserva = new ArrayList<>();

    }

    public static CentroDeBuceo getInstancia(String nombre) {
        if (instance == null) {
            instance = new CentroDeBuceo(nombre);
        }
        return instance;
    }

    public void agregarBuceo(Buceo buceo, Mes mes){
        if(this.buscarbuceoPorId(buceo.getId() ) == null){
            buceosRegistrados.put(buceo, mes);
            System.out.println("Se agrego el buceo "+ buceo.toString() + " con éxito");
        }

    }

    private Buceo buscarbuceoPorId(int idBuceo){
        for (Buceo buceo : this.buceosRegistrados.keySet()) {
            if(buceo.getId() == idBuceo){
                return buceo;
            }
        }
        return null;
    }
}
