
package clases;

public enum Fragilidad {
	MINIMA("Fragilidad modearada"),
	MEDIA("Fragilidad considerable"),
	MAXIMA("Elementos de alta fragilidad, con riesgo de rotura"),
	ESTREMA("Manejar con extremo cuidado");

    private final String descripcion;

    Fragilidad(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

