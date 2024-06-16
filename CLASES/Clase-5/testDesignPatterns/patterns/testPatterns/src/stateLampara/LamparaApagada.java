package stateLampara;

public class LamparaApagada implements EstadoLampara {
    @Override
    public void encender(Lampara lampara) {
        System.out.println("Encendiendo la lámpara.");
        lampara.setEstado(new LamparaEncendida());
    }

    @Override
    public void apagar(Lampara lampara) {
        System.out.println("La lámpara ya está apagada.");
    }
}