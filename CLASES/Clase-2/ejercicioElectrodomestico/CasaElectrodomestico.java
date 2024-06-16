package ejercicioElectrodomestico;

import java.util.ArrayList;
import java.util.List;

public class CasaElectrodomestico {

    private List<Electrodomestico> productos;

    public CasaElectrodomestico() {
        this.productos = new ArrayList<Electrodomestico>();
    }

    public void agregarProductos(Electrodomestico e) {
        this.productos.add(e);
    }

    public void mostarProductos() {
        for (Electrodomestico electrodomestico : productos) {
            System.out.println(electrodomestico.toString());
        }
    }

    public double totalProductos() {
        double total = 0;
        for (Electrodomestico electrodomestico : productos) {
            total += electrodomestico.getPrecio();
        }
        return total;
    }

}
