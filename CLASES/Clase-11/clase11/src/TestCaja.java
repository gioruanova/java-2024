public class TestCaja {

    public static void main(String[] args) {

        /*
         * Metodo antiguo
         */

        // Caja caja = new Caja(7);

        // Mogul m1 = new Mogul("Estrella");
        // Mogul m2 = new Mogul("Nube");
        // Mogul m3 = new Mogul("Roca");
        // Mogul m4 = new Mogul("Corazon");

        // SugusMax s1 = new SugusMax("Frutilla");
        // SugusMax s2 = new SugusMax("Uva");
        // SugusMax s3 = new SugusMax("Mandarina");
        // SugusMax s4 = new SugusMax("Naranja");

        // try {
        // caja.add(m1);
        // caja.add(m2);
        // caja.add(m3);
        // caja.add(m4);
        // caja.add(s1);
        // caja.add(s2);
        // caja.add(s3);
        // caja.add(s4);

        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // } finally {
        // for (Object o : caja) {
        // if (o instanceof Mogul) {
        // Mogul mogul = (Mogul) o;
        // System.out.println(mogul.getForma());
        // } else {
        // SugusMax sugusMax = (SugusMax) o;
        // System.out.println(sugusMax.getGusto());
        // }
        // }

        // }

        Caja<SugusMax> cajaSugus = new Caja(7);
        Caja<Mogul> cajaMogul = new Caja(7);

        Mogul m1 = new Mogul("Estrella");
        Mogul m2 = new Mogul("Nube");
        Mogul m3 = new Mogul("Roca");
        Mogul m4 = new Mogul("Corazon");

        SugusMax s1 = new SugusMax("Frutilla");
        SugusMax s2 = new SugusMax("Uva");
        SugusMax s3 = new SugusMax("Mandarina");
        SugusMax s4 = new SugusMax("Naranja");

        System.out.println("Lista Original");
        cajaSugus.add(s1);
        cajaSugus.add(s2);
        cajaSugus.add(s3);
        cajaSugus.add(s4);
        cajaSugus.forEach(x -> System.out.println(x.getGusto()));
        System.out.println("Remove");
        cajaSugus.remover();
        cajaSugus.forEach(x -> System.out.println(x.getGusto()));

    }

}
