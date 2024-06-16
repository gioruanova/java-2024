import clases.Sucursal;
import excepciones.ExcepcionDespachar;
import excepciones.ExcepcionFlete;
import clases.CentralDeDespachos;
import clases.Fragilidad;

public class Main {

	private static CentralDeDespachos central = new CentralDeDespachos();

	public static void main(String[] args) throws ExcepcionFlete, ExcepcionDespachar {
		System.out.println("Agregamos algunos fletes:");
		agregarFlete("AA111CD", 100);
		agregarFlete("AB222EF", 120);
		agregarFlete("AC333GH", 100);
		agregarFlete("AD444JK", 120);
		agregarFlete("AC333GH", 100);
		System.out.println();

		System.out.println("Agregamos algunos paquetes para despachar:");
		agregarPaquete(Sucursal.ALMAGRO, 30);
		agregarPaquete(Sucursal.PALERMO, 45);
		agregarPaquete(Sucursal.BOEDO, 20);
		agregarPaquete(Sucursal.FLORES, 35);
		// agregarPaquete(Sucursal.ALMAGRO, 40, Fragilidad.ESTREMA); // Descomentar para testear escenario
		agregarPaquete(Sucursal.ALMAGRO, 40);
		agregarPaquete(Sucursal.PALERMO, 25);
		agregarPaquete(Sucursal.BOEDO, 15);
		agregarPaquete(Sucursal.FLORES, 20);
		agregarPaquete(Sucursal.ALMAGRO, 30);
		agregarPaquete(Sucursal.PALERMO, 35);
		agregarPaquete(Sucursal.BOEDO, 20);
		agregarPaquete(Sucursal.FLORES, 40);
		agregarPaquete(Sucursal.ALMAGRO, 35);
		agregarPaquete(Sucursal.PALERMO, 25);
		agregarPaquete(Sucursal.BOEDO, 20);
		agregarPaquete(Sucursal.FLORES, 15);
		agregarPaquete(Sucursal.RETIRO, 50);
		System.out.println();

		System.out.println("Despachamos los paquetes pendientes:");
		System.out.println("Paquetes despachados: " + central.despacharPendientes());
		System.out.println("Paquetes pendientes: " + central.paquetesPendientes());
		System.out.println();

		System.out.println("No deber�a permitir agregar este flete:");
		agregarFlete("AB222EF", 120);
		System.out.println();

		central.listarFletesDespachadosConPaqueteMasPesado();

		// // Este testeo provee una nueva subclase con herencia. Para testearla es
		// // necesario ir cambiando algunos valores de los paquetes iniciales para no
		// // utiliar fletes ya existentes

		// System.out.println("Testeo adicional sobre generics y herencia con paquete fragil");
		// agregarFlete("TEST1234", 100);
		// agregarPaquete(Sucursal.RETIRO, 95, Fragilidad.ESTREMA);
		// System.out.println("Despachamos los paquetes pendientes:");
		// System.out.println("\nPaquetes despachados: " + central.despacharPendientes());
		// System.out.println("Paquetes pendientes: " + central.paquetesPendientes());
		// central.listarFletesDespachadosConPaqueteMasPesado();
		// central.mostrarFletesDespachados();
		// central.mostrarFletesDisponibles();

	}

	private static void agregarFlete(String patente, double cargaMaxima) throws ExcepcionFlete {
		boolean resultado = central.agregarFlete(patente, cargaMaxima);
		System.out.println("agregarFlete(" + patente + ", " + cargaMaxima + "): " + resultado);
	}

	private static void agregarPaquete(Sucursal destino, double peso) {
		central.agregarPaquete(destino, peso);
		System.out.println("agregarPaquete(" + destino + ", " + peso + ")");
	}

	
	// // Descomentar para testear
	// private static void agregarPaquete(Sucursal destino, double peso, Fragilidad fragilidad) {
	// 	central.agregarPaquete(destino, peso, fragilidad);
	// 	System.out.println("agregarPaquete(" + destino + ", " + peso + ", " + fragilidad + ")");
	// }
}
