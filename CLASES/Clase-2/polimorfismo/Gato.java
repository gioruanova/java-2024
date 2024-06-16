package polimorfismo;

public class Gato extends Mascota {

    public Gato(String nombre) {
        super(nombre);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void saludar() {
        System.out.println("MIAU");
        ;
    }

}
