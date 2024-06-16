package com.examplejpatest.clases;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int edad;
    private String nombre;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    private List<Direccion> direcciones;

    @OneToMany(cascade = CascadeType.ALL)
    // @OrderColumn(name = "telefono_orden")
    // private List<Telefono> telefonos;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    // public void setTelefonos(List<Telefono> asList) {
    // this.telefonos = asList;
    // }
}
