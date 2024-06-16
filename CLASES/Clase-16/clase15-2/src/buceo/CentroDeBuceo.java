package buceo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import buceo.excepciones.ErroresReserva;

public class CentroDeBuceo {

    public final String BUCEO_INVALIDO = "Buzo invalido";
    public final String NO_HABILITADO = "Buzo no habilitado por la profundidad maxima permitida";

    /*
     * Singleton
     */

    private static CentroDeBuceo instance;
    private String nombre;
    private List<ErroresReserva> erroresReserva;
    private HashMap<Buzo, Buceo> buzosResgistrados;
    private HashMap<Buceo, Mes> buceosRegistrados;
    private ListaBuceosPorId<Buceo> buceosDisponibles;
    private int[] cantidadBuceosPorMes;

    private CentroDeBuceo(String nombre) {
        this.buceosDisponibles = new ListaBuceosPorId();
        this.nombre = nombre;
        this.buceosRegistrados = new HashMap<>();
        this.buzosResgistrados = new HashMap<>();
        this.erroresReserva = new ArrayList<>();
        this.cantidadBuceosPorMes = new int[Mes.values().length];
    }

    public static CentroDeBuceo getInstancia(String nombre) {
        if (instance == null) {
            instance = new CentroDeBuceo(nombre);
        }
        return instance;
    }

    public void registrarBuceos(Buzo buzo, Integer idBuceo) {
        if (buzo == null) {
            throw new IllegalArgumentException(BUCEO_INVALIDO);
        }

        boolean existe = false;
        for (Buzo registrado : buzosResgistrados.keySet()) {
            if (registrado.getNombre().equals(buzo.getNombre())) {
                existe = true;
                return;
            }
        }

        Buceo buceo = this.buscarbuceoPorId(idBuceo);
        if (!existe && buzo.habilitado(buceo.getProfundidad())) {
            buzosResgistrados.put(buzo, buceo);
            buzo.agregarBitacora(buceo);
            cantidadBuceosPorMes[this.buceosRegistrados.get(buceo).ordinal()] += 1;
        } else {
            this.erroresReserva
                    .add(new ErroresReserva(buzo.toString() + " - " + NO_HABILITADO + " (" + buceo.toString() + ")"));
        }

    }

    public void agregarBuceo(Buceo buceo, Mes mes) {
        if (this.buscarbuceoPorId(buceo.getId()) == null) {
            buceosRegistrados.put(buceo, mes);
            System.out.println("Se agrego el buceo " + buceo.toString() + " con éxito");
        }

    }

    private Buceo buscarbuceoPorId(int idBuceo) {
        for (Buceo buceo : this.buceosRegistrados.keySet()) {
            if (buceo.getId() == idBuceo) {
                return buceo;
            }
        }
        return null;
    }

    public void cantidadReservasPorMes() {
        System.out.println("--------------");
        System.out.println("Cantidad de buceos por mes");
        for (int i = 0; i < cantidadBuceosPorMes.length; i++) {
            System.out.println(Mes.values()[i] + ": " + cantidadBuceosPorMes[i]);
        }
    }

    public void listarErrores() {
        System.out.println("--------------");
        System.out.println("Errores: ");
        for (ErroresReserva e : this.erroresReserva) {
            System.out.println(e.getMessage());
        }
    }

}
