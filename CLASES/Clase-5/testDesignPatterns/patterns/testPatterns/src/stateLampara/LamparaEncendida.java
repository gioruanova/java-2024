package stateLampara;

public class LamparaEncendida implements EstadoLampara {
    @Override
    public void encender(Lampara lampara) {
        System.out.println("La lámpara ya está encendida.");
    }

    @Override
    public void apagar(Lampara lampara) {
        System.out.println("Apagando la lámpara.");
        lampara.setEstado(new LamparaApagada());
    }
}
