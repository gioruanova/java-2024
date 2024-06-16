package integrador;

import java.util.List;

public abstract class Empleado {

    protected String nombre;
    protected double salario;
    private List<Empleado> historial;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void trabajar() {
        System.out.println(nombre + " realiza sus tareas habituales");
    }

    public void getListaEmpleados() {
        if (this instanceof Gerente) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

    }

}
