public class ProcesadorDePagos {

    public static void main(String[] args) {
        ProcesadorDePagos procesarDePago = new ProcesadorDePagos();

        try {
            procesarDePago.procesarPago(20000);

        } catch (PagoFallidoException e) {
            System.out.println("Error al procesar el pago: " + e.getMessage());
            System.out.println("Error causado por: " + e.getCause().getMessage());
        }
    }

    public void procesarPago(double canditad) throws PagoFallidoException {
        try {
            if (fondosInsuficientes()) {
                throw new FondosInsuficientesException("Fondos insuficientes");
            }

        } catch (Exception e) {
            System.out.println("No se pudo procesar el pago: " + e.getMessage());
            throw new PagoFallidoException("No se pudo procesar el pago", e);
        }
    }

    public boolean fondosInsuficientes() {
        return true;
    }

}
