package integrador;

public class Analista extends Empleado {
    public Analista(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " analiza datos y elabora informes");
    }

    public void testSingleton() {
        RegistroEmpleados re = RegistroEmpleados.obtenerInstancia();
        re.setCantidadEmpleados(100);
        System.out.println(re.getCantidadEmpleados());
    }
}