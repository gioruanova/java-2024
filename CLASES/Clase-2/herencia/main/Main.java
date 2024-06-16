package herencia.main;

import herencia.Lancha;
import herencia.Moto;
import herencia.Vehiculo;
import herencia.VehiculoTerrestre;

public class Main {

    public static void main(String[] args) {

        Moto m = new Moto();
        // m.acelerar();
        // m.frenar();

        System.out.println(m.toString());

        VehiculoTerrestre v = m;
        // v.acelerar();
        // v.frenar();
        // v.hacerOffRoad();

        // Vehiculo v1 = new Lancha();
        // Moto moto = (Moto) v1; // Una lancha no puede ser una moto
        // moto.hacerOffRoad();

        // Moto m2 = (Moto) v;
        // m2.hacerOffRoad();

        // Vehiculo v2 = new Lancha();
        // if (v2 instanceof Moto) {
        // Moto esUnaMoto = (Moto) v2; // Downcasting
        // esUnaMoto.hacerOffRoad();
        // } else {
        // System.out.println("No era una Moto");
        // }

        // v.hacerOffRoad(); // Misma razon que la anterior, referencia a
        // VehiculoTerrestre

        // Object x = m;
        // x.acelerar(); // Misma razon que la anterior, referencia
        // x.prenderAire(); // Misma razon que la anterior, referencia

    }

}
