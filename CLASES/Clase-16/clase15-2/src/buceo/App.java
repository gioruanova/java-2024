package buceo;

import buceo.excepciones.ExcepcionEdad;
import buceo.excepciones.ExcepcionNacionalidad;

public class App {

    public static void main(String[] args) throws ExcepcionNacionalidad, ExcepcionEdad {

        System.out.println("Ejercicio Integrador");
        CentroDeBuceo cba = CentroDeBuceo.getInstancia("Fondo del mar");

        // Creamos lugares para bucear
        System.out.println("Se agregan buceos");
        agregarBuceos(cba);
        // Creamos buceadores
        registrarBuceadores(cba);
        // Mostramos listados
        cba.listarErrores();
        cba.cantidadReservasPorMes();

    }

    private static void agregarBuceos(CentroDeBuceo cba) {
        // Llamamos a nuestro otro metodo agregarBuceos sobrecargado
        agregarBuceos(cba, new Buceo(6, "Isla Victoria", 18), Mes.ENERO);
        agregarBuceos(cba, new Buceo(2, "Dique Piedras Moras", 23), Mes.ENERO);
        agregarBuceos(cba, new Buceo(8, "Parque Nacional de Tierra del Fuego", 20), Mes.FEBRERO);
        agregarBuceos(cba, new Buceo(4, "Los Reyunos", 25), Mes.MARZO);
        agregarBuceos(cba, new Buceo(1, "Dique Segunda Usina", 35), Mes.ABRIL);
        agregarBuceos(cba, new Buceo(10, "Puerto Madryn", 30), Mes.MAYO);
        agregarBuceos(cba, new Buceo(5, "Nahuel Huapi", 22), Mes.JUNIO);
        agregarBuceos(cba, new Buceo(7, "Golfo San Mat�as", 30), Mes.SEPTIEMBRE);
        agregarBuceos(cba, new Buceo(9, "PirAmides", 25), Mes.NOVIEMBRE);
        agregarBuceos(cba, new Buceo(3, "Bosque sumergido de Villa Traful", 20), Mes.DICIEMBRE);
    }

    private static void registrarBuceadores(CentroDeBuceo cba) {
        registrarBuceadorOpenWater(cba, "Juan", "Argentino", 23, 3);
        registrarBuceadorOpenWater(cba, "John", "Norteamericano", 16, 1);
        registrarBuceadorOpenWater(cba, "Catalina", "Argentina", 23, 5);
        registrarBuceadorOpenWater(cba, "Catalina", "Argentina", 23, 10);

        registrarBuceadorAdvanced(cba, "Esteban", "Argentino", 23, 3);
        registrarBuceadorAdvanced(cba, "", "Chileno", 23, 3);
        registrarBuceadorAdvanced(cba, "Ricardo", "Espa�ol", 23, 7);
        registrarBuceadorAdvanced(cba, "Juana", null, 23, 7);
        registrarBuceadorAdvanced(cba, "Carolina", "Argentina", 23, 1);

        registrarBuceadorTecnico(cba, "Maximiliano", "Argentino", 23, 1);
        registrarBuceadorTecnico(cba, "Maximiliano", "Argentino", 23, 144);
        registrarBuceadorTecnico(cba, "Juana", "Argentina", 23, 2);
        registrarBuceadorTecnico(cba, "Josefa", "Argentino", 23, 7);
    }

    private static void agregarBuceos(CentroDeBuceo cba, Buceo b, Mes m) {
        cba.agregarBuceo(b, m);
    }

    private static void registrarBuceadorAdvanced(CentroDeBuceo cba, String nombre, String nacionalidad,
            int edad, int idBuceo) {
        try {
            cba.registrarBuceos(new AdvanceOpenWater(nombre, nacionalidad, edad), idBuceo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void registrarBuceadorTecnico(CentroDeBuceo cba, String nombre, String nacionalidad,
            int edad, int idBuceo) {
        try {
            cba.registrarBuceos(new Tecnico(nombre, nacionalidad, edad), idBuceo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void registrarBuceadorOpenWater(CentroDeBuceo cba, String nombre, String nacionalidad,
            int edad, int idBuceo) {
        try {
            cba.registrarBuceos(new OpenWater(nombre, nacionalidad, edad), idBuceo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
