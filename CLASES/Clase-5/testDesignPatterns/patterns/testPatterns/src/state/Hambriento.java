package state;

public class Hambriento implements Estado{

    @Override
    public void cambiarEstado(Contexto contexto) {
        System.out.println("Estoy hambriento");
        contexto.setEstado(new Hambriento());
        
    }

}
