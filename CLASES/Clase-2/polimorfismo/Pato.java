package polimorfismo;

public class Pato extends Mascota {

    public Pato(String nombre) {
        super(nombre);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void saludar() {
        System.out.println("CUAK!");
        ;
    }

}
