package util;

public abstract class Libro {

    public String nombre;
    public String autor;
    /*
     * Me permite la comunicacion entre clase SUPERCLASE
     * y SUBCLASE 
     */
    protected Integer anioEdicion;
    protected String variableClasePadre = "Desde clase padre";

    public Libro(String nombre, String autor, Integer anioEdicion) {
        this.nombre = nombre;
        this.autor = autor;
        this.anioEdicion = anioEdicion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAnioEdicion() {
        return anioEdicion;
    }

}
