package integrador;

import java.util.List;

public class Gerente extends Empleado implements VerificarDesempenio {

    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " coordina el trabajo del equipo");
    }

    @Override
    public void revisarDesempeño() {
        this.getListaEmpleados();
        System.out.println(nombre + " evalúa el desempeño de los empleados");
    }
}