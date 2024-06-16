package clases;

import java.util.ArrayList;
import excepciones.ExcepcionDespachar;
import excepciones.ExcepcionFlete;

public class CentralDeDespachos {

	private static final String MSG_DESPACHO_NO_DESPACHADO = "--E: [Despacho en pausa. Flete patente %s%s %.2f]--";

	private ArrayList<Flete<Paquete>> fletesDisponibles;
	private ArrayList<Flete<Paquete>> fletesDespachados;
	private ArrayList<Paquete> paquetesPendientes;

	public CentralDeDespachos() {
		fletesDisponibles = new ArrayList<>();
		fletesDespachados = new ArrayList<>();
		paquetesPendientes = new ArrayList<>();
	}

	private Flete<Paquete> buscarFlete(String patente, ArrayList<Flete<Paquete>> listaFletes) {
		int index = 0;
		while (index < listaFletes.size() && !listaFletes.get(index).mismaPatente(patente)) {
			index++;
		}
		return index < listaFletes.size() ? listaFletes.get(index) : null;
	}

	public boolean agregarFlete(String patente, double cargaMaxima) throws ExcepcionFlete {
		boolean pudo = false;
		try {
			if (buscarFlete(patente, fletesDisponibles) == null) {
				if (buscarFlete(patente, fletesDespachados) == null) {
					fletesDisponibles.add(new Flete<Paquete>(patente, cargaMaxima));
					pudo = true;
				} else {
					pudo = false;
					// throw new ExcepcionFlete(); // Descomentar para ver excepcion
				}
			} else {
				pudo = false;
				// throw new ExcepcionFlete(); // Descomentar para ver excepcion
			}
		} catch (ExcepcionFlete e) {
			System.out.println("\n--E: [" + e.getMessage() + patente + "]--");
		}

		return pudo;
	}

	public void mostrarFletesDisponibles() {
		System.out.println("Fletes Disponibles:\n");
		for (Flete<Paquete> f : fletesDisponibles) {
			System.out.println(f.toString());
		}
	}

	public void mostrarFletesDespachados() {
		System.out.println("Fletes Despachados:\n");
		for (Flete<Paquete> f : fletesDespachados) {
			System.out.println(f.toString());
		}
	}

	public void agregarPaquete(Sucursal sucursal, double peso) {
		paquetesPendientes.add(new Paquete(sucursal, peso));
	}

	public void agregarPaquete(Sucursal sucursal, double peso, Fragilidad fragilidad) {
		paquetesPendientes.add(new PaqueteFragil(sucursal, peso, fragilidad));
	}

	public int paquetesPendientes() {
		return paquetesPendientes.size();
	}

	public void mostrarPaquetesPendientes() {
		for (Paquete pac : paquetesPendientes) {
			System.out.println(pac.toString());
		}
	}

	public void mostrarMensajeFleteNoDespachado(String patente, String mensajeExcepcion, double valor) {
		String mensaje = String.format(MSG_DESPACHO_NO_DESPACHADO, patente, mensajeExcepcion, valor);
		System.out.println(mensaje);
	}

	public int despacharPendientes() throws ExcepcionDespachar {
		ArrayList<Paquete> paquetesADespachar = new ArrayList<>();
		int paquetesDespachados = 0;

		for (Paquete paqDis : paquetesPendientes) {
			boolean despachado = false;
			for (Flete<Paquete> fleteDis : fletesDisponibles) {

				if (fleteDis.cargarPaquete(paqDis)) {
					try {
						if (fleteDis.esDespachable()) {
							fletesDespachados.add(fleteDis);
							fletesDisponibles.remove(fleteDis);

							// // Descomentar para ver las excepciones
							// System.out.println(
							// "--[Flete patente: " + fleteDis.getPatente()
							// + " completo y despachado. Carga al: % "
							// + (fleteDis.getCargaActual() / fleteDis.getCargaMaxima() * 100) + "]--");

						} else {
							throw new ExcepcionDespachar();
						}
					} catch (ExcepcionDespachar e) {

						// // Descomentar para ver las excepciones
						// mostrarMensajeFleteNoDespachado(fleteDis.getPatente(), e.getMessage(),
						// (fleteDis.getCargaActual() / fleteDis.getCargaMaxima() * 100));

					}

					despachado = true;
					paquetesDespachados++;
					break;
				}
			}
			if (despachado) {
				paquetesADespachar.add(paqDis);
			}
		}
		paquetesPendientes.removeAll(paquetesADespachar);
		return paquetesDespachados;
	}

	public void listarFletesDespachadosConPaqueteMasPesado() {
		System.out.println("Listado de fletes despachados con su paquete más pesado:");
		fletesDespachados.forEach(flete -> {
			Paquete paqueteMasPesado = flete.obtenerPaqueteMasPesado();
			if (paqueteMasPesado != null) {
				String fragilidadInfo = "";
				if (paqueteMasPesado instanceof PaqueteFragil) {
					// PaqueteFragil paqueteFragil = (PaqueteFragil) paqueteMasPesado;
					// fragilidadInfo = " | Fragilidad: " +
					// paqueteFragil.getFragilidad().getDescripcion(); // Descomentar para ver
					// funcionalidad
				}
				System.out.println("Patente: " + flete.getPatente() + " | Destino: " + paqueteMasPesado.getDestino()
						+ " | Paquete: " + paqueteMasPesado.getNroSeguimiento() + " | Peso: "
						+ paqueteMasPesado.getPeso()
						+ fragilidadInfo);
			} else {
				System.out.println("Flete: " + flete.getPatente() + " no posee paquetes para enviar.");
			}
		});
	}

}
