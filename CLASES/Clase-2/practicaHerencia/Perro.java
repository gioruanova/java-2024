package practicaHerencia;

public class Perro extends Mamifero implements Cuadrupedo, Domesticable {

    public Perro(String nombre) {
        super(nombre);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean esDomestible() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esDomestible'");
    }

}
