package testBanco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestBanco {

    public static void main(String[] args) {

        Banco<Dolar> banco = Banco.getInstancia();

        banco.depositar(1000.0, new Dolar("Dolar"));
        banco.depositar(1400.0, new Dolar("Dolar"));
        banco.depositar(3000.0, new Dolar("Dolar"));
        banco.consultarSaldo(new Dolar("Dolar"));

        Collections.sort(banco.getCandidadDeDepositos());

        System.out.println("Ordenado de menor a mayor: ");
        for (Double valor : banco.getCandidadDeDepositos()) {
            System.out.println("Valor: " + valor);
        }

        Collections.sort(banco.getCandidadDeDepositos(), Collections.reverseOrder());
        System.out.println("Ordenado de mayor a menor: ");
        for (Double valor : banco.getCandidadDeDepositos()) {
            System.out.println("Valor: " + valor);
        }

        Double d1 = 22.1;
        Double d2 = 40.0;

        List<Double> doubles = new ArrayList<>();
        doubles.add(d2);
        doubles.add(d1);

        Collections.sort(doubles, Comparator.reverseOrder());
        doubles.forEach(x -> System.out.println(x));
        
        System.out.println(d1.compareTo(d2));
        System.out.println(Double.compare(d1, d2));

    }

}
