import util.Libro;

public class LibroDeBolsillo extends Libro {

    private boolean tapaDura;

    public LibroDeBolsillo(String nombre, String autor, Integer anioEdicion, boolean tapaDura) {
        super(nombre, autor, anioEdicion);
        this.tapaDura = tapaDura;
        // TODO Auto-generated constructor stub
    }

    public void probandoScope() {

        System.out.println(super.nombre);

    }

}
