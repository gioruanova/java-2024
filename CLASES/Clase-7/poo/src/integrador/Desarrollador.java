package integrador;

public class Desarrollador extends Empleado {
    public Desarrollador(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " programa nuevas funcionalidades");
    }
}