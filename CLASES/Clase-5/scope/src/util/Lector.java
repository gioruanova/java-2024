package util;

import java.util.ArrayList;
import java.util.List;

public class Lector {

    String nombre;
    List<Libro> librosLeidos;

    public Lector(String nombre) {
        this.librosLeidos = new ArrayList<Libro>();
        this.nombre = nombre;
    }

    public void addLibro(Libro libro) {
        this.librosLeidos.add(libro);
    }

    public void mostrarLibros() {
        this.librosLeidos.stream().forEach(n -> System.out.println(n.nombre));
    }

}
