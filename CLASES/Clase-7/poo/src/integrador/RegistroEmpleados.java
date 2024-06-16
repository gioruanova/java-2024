package integrador;

public class RegistroEmpleados {
    /*
     * esta es la unica instancia
     */
    private static RegistroEmpleados instancia;
    private int cantidadEmpleados;

    private RegistroEmpleados() {
        cantidadEmpleados = 0;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    /*
     * 
     */
    public static RegistroEmpleados obtenerInstancia() {
        if (instancia == null) {
            instancia = new RegistroEmpleados();
        }
        return instancia;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public void agregarEmpleado() {
        cantidadEmpleados++;
        System.out.println("Se ha agregado un nuevo empleado. Total: " + cantidadEmpleados);
    }
}