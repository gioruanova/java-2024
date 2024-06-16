package com.examplejpatest.clases;

public enum Genero {

    MASCULINO("Masculino"), FEMENINO("Femenino"), NO_DEFINIDO("No definido");

    private String nombre;

    private Genero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
