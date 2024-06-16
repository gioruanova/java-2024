package state;

public class Feliz implements Estado{

    @Override
    public void cambiarEstado(Contexto contexto) {
        System.out.println("Estoy feliz");
        contexto.setEstado(new Triste());
    }

}
