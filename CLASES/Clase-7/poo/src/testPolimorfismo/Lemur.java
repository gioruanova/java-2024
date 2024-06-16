package testPolimorfismo;

public class Lemur extends Primate implements TienePelo {

    public int edad = 10;

    @Override
    public boolean tieneRallas() {
        return false;
    }

    public static void main(String[] args) {

        Lemur l = new Lemur();
        System.out.println(l.edad);

        TienePelo tl = l;
        System.out.println(tl.tieneRallas());

        Primate primate = l;
        System.out.println(primate.tieneCabello());

        Lemur nuevaVariable = (Lemur) tl;

        System.out.println(nuevaVariable.edad);

        // System.out.println(tl.edad);

        // System.out.println(primate.tieneRallas());

        // Acuatico volador = helicopeto
        // Volador volador = superman
        // SuperHeroe h1 = (SuperHeroe) volador
        // h1.extraFuerza();

    }

}
