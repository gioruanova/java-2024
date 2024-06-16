package testBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco<T extends Moneda> implements CuentaBancaria<T>, Comparable<Double> {

    private static Banco instancia;
    private Double saldo;
    private List<T> historicoModenas;
    private List<Double> cantidadDeDepositos;

    private Banco() {
        saldo = 0.0;
        this.historicoModenas = new ArrayList<>();
        this.cantidadDeDepositos = new ArrayList<>();
    }

    public static Banco getInstancia() {
        if(instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }

    public List<Double> getCandidadDeDepositos() {
        return cantidadDeDepositos;
    }

    @Override
    public void depositar(Double monto, T moneda) {
        this.saldo += monto;
        this.cantidadDeDepositos.add(monto);
        System.out.println("Se depositaron: " + monto + " " + moneda.getNombre());
    }

    @Override
    public void extraer(Double monto, T moneda) {
        if (this.saldo > 0) {
            this.saldo -= monto;
            this.historicoModenas.add(moneda);
            System.out.println("Se extrajo: " + monto + " " + moneda.getNombre());
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void consultarSaldo(T moneda) {
        System.out.println("Tu saldo es: " + this.saldo + " " + moneda.getNombre());
    }

    @Override
    public int compareTo(Double o) {
        return this.saldo.compareTo(o);
        // Hace lo mismo que el metodo de arriba
        // return Double.compare(this.saldo, o);
    }

}