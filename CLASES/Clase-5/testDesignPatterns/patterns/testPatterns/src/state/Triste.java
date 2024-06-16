package state;

public class Triste implements Estado {

    @Override
    public void cambiarEstado(Contexto contexto) {
        System.out.println("Estoy triste");
        contexto.setEstado(new Feliz());
    }

}
