package polimorfismo;

public class Perro extends Mascota {

    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public void saludar() {
        System.out.println("WOW");
        ;
    }

    public String getRaza() {
        return raza;
    }

}
