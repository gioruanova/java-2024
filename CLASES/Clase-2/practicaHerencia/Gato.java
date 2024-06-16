package practicaHerencia;

public class Gato implements Trepables {

    @Override
    public void trepar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'trepar'");
    }

    public void mostrarMSG() {
        System.out.println(RAZA);
        System.out.println(ALTURAS[0]);
    }

    @Override
    public boolean puedoVolar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'puedoVolar'");
    }

    @Override
    public boolean puedePlanear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'puedePlanear'");
    }

    @Override
    public boolean esDomestible() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esDomestible'");
    }

}
