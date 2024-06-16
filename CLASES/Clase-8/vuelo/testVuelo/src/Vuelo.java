import java.util.ArrayList;
import java.util.List;

public class Vuelo implements Calculable {

    public final String noHayReserva = "No hay reserva para la clase %s\n";
    public final String montoAcumulado = "El monto acumulado hasta el momento en %s es: $%d\n";

    private String numeroVuelo;
    private Integer cantidadAsientos;
    private Integer montoRecaudado;
    private List<Asiento> asientos;

    public Vuelo(String numeroVuelo, Integer cantidadAsientos) {
        this.asientos = new ArrayList<Asiento>();
        this.numeroVuelo = numeroVuelo;
        this.montoRecaudado = 0;
        this.cantidadAsientos = cantidadAsientos;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public Integer getCantidadAsientos() {
        return cantidadAsientos;
    }

    public Integer getMontoRecaudado() {
        return montoRecaudado;
    }

    private Asiento buscarAsientoReservado(String fila, int numero) {
        int i = 0;
        boolean seEncontro = false;
        while (i < this.asientos.size() && !seEncontro) {
            if (this.asientos.get(i).getFila().equals(fila) && this.asientos.get(i).getNumero() == numero) {

                return this.asientos.get(i);
            }
            i++;
        }
        return null;
    }

    private boolean verDistanciamiento(String fila, int numero) {
        if (numero == 6) {
            Asiento asientoIzquierda = this.buscarAsientoReservado(fila, numero - 1);
            return asientoIzquierda == null;
        } else if (numero == 1) {
            Asiento asientoDerecha = this.buscarAsientoReservado(fila, numero + 1);
            return asientoDerecha == null;
        } else {
            Asiento asientoIzquierda = this.buscarAsientoReservado(fila, numero - 1);
            Asiento asientoDerecha = this.buscarAsientoReservado(fila, numero + 1);
            return asientoDerecha == null && asientoIzquierda == null;
        }

    }

    public ResultadoReservaAsientos reservarAsiento(Asiento asiento) {
        if (asientos.size() >= this.cantidadAsientos) {
            return ResultadoReservaAsientos.ERROR_AVION_COMPLETO;
        } else {
            if (this.buscarAsientoReservado(asiento.getFila(), asiento.getNumero()) != null) {
                return ResultadoReservaAsientos.ERROR_YA_TIENE_UN_PASAJE;
            } else if (this.verDistanciamiento(asiento.getFila(), asiento.getNumero())) {
                this.asientos.add(asiento);
                this.montoTotal(asiento.getPrecio());
                return ResultadoReservaAsientos.RESERVA_CONFIRMADA;
            } else {
                return ResultadoReservaAsientos.ERROR_EL_ASIENTO_DE_AL_LADO_ESTA_OCUPADO;
            }
        }

    }

    public void mostrar() {
        int acuPrimera = 0;
        int acuTurista = 0;
        int acuBusiness = 0;

        for (Asiento asiento : asientos) {
            switch (asiento.getClass().getSimpleName()) {
                case "AsientoPrimera":
                    acuPrimera += asiento.getPrecio();
                    break;
                case "AsientoTurista":
                    acuTurista += asiento.getPrecio();
                    break;
                case "AsientoBusiness":
                    acuBusiness += asiento.getPrecio();
                    break;
            }

        }
        if (acuPrimera > 0) {
            System.out.printf(montoAcumulado, "PRIMERA", acuPrimera);
        } else {
            System.out.printf(noHayReserva, "PRIMERA");
        }
        if (acuBusiness > 0) {
            System.out.printf(montoAcumulado, "BUSINESS", acuBusiness);
        } else {
            System.out.printf(noHayReserva, "BUSINESS");
        }
        if (acuTurista > 0) {
            System.out.printf(montoAcumulado, "TURISTA", acuTurista);
        } else {
            System.out.printf(noHayReserva, "TURISTA");
        }
        System.out.println("Monto total recaudado: $" + montoRecaudado);
    }

    @Override
    public void montoTotal(Integer monto) {
        this.montoRecaudado += monto;
    }

}
