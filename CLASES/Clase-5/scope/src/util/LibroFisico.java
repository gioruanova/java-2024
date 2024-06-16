package util;

public class LibroFisico extends Libro {

    public int cantidadPaginas;

    public LibroFisico(String nombre, String autor, Integer anioEdicion, int cantidadPaginas) {
        super(nombre, autor, anioEdicion);
        this.cantidadPaginas = cantidadPaginas;
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "LibroFisico [nombre=" + nombre + ", cantidadPaginas=" + cantidadPaginas + ", autor=" + autor + "]";
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

}
