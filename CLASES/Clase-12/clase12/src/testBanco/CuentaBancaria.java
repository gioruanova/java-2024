package testBanco;

public interface CuentaBancaria <T extends Moneda> {

    void depositar(Double monto, T moneda);

    void extraer(Double monto, T moneda);

    void consultarSaldo(T moneda);

}
