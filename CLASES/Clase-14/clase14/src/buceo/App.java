package buceo;

import buceo.excepciones.ExcepcionNombre;

public class App {

    public static void main(String[] args) {

        crearBuzo("Pepe", "ARG", 23);
        
    }

    public static void crearBuzo(String nombre, String nacionalidad, int edad) {
        try {
            Buzo buzo = new OpenWater(nombre, nacionalidad, edad);
        } catch (ExcepcionNombre e) {
           
            e.printStackTrace();
        }
    }
}
