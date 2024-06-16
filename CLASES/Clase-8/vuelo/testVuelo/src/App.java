public class App {
	public static void main(String[] args) throws Exception {

		TorreDeControl tc = TorreDeControl.getInstance();

		System.out.println(tc.getNombre());
		System.out.println(tc.hashCode());

		// Vuelo vuelo = new Vuelo("AA3313", 3);

		// System.out.println(vuelo.reservarAsiento(new AsientoPrimera(new
		// Pasajero(11111111, 1234567890), "A", 1)));
		// System.out.println(vuelo.reservarAsiento(new AsientoTurista(new
		// Pasajero(22222222, 1234567891), "F", 6)));
		// System.out.println(vuelo.reservarAsiento(new AsientoPrimera(new
		// Pasajero(33333333, 1234567892), "A", 2)));
		// System.out.println(vuelo.reservarAsiento(new AsientoTurista(new
		// Pasajero(44444444, 1234567894), "F", 5)));
		// System.out.println(vuelo.reservarAsiento(new AsientoBusiness(new
		// Pasajero(55555555, 1234567895), "A", 1)));
		// /*
		// * Descomentar para probar ocupacion completa
		// */
		// System.out.println(vuelo.reservarAsiento(new AsientoBusiness(new
		// Pasajero(66666666, 1234567896), "G", 1)));
		// System.out.println(vuelo.reservarAsiento(new AsientoBusiness(new
		// Pasajero(77777777, 1234567899), "H", 5)));
		// System.out.println(vuelo.reservarAsiento(new AsientoBusiness(new
		// Pasajero(77777777, 1234567899), "T", 6)));

		// vuelo.mostrar();
		TorreDeControl tc1 = TorreDeControl.getInstance();

		System.out.println(tc.getNombre());
		System.out.println(tc.hashCode());
		System.out.println(tc1.getNombre());
		System.out.println(tc1.hashCode());
	}
}
