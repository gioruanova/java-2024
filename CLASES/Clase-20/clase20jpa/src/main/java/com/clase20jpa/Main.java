package com.clase20jpa;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.Genero;
import clases.Persona;
import clases.Telefono;
import clases.Direccion;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Persona persona = new Persona();

        persona.setEdad(33);
        persona.setGenero(Genero.MASCULINO);
        persona.setNombre("Fernando");
        persona.setEmail("fernando.valls@davinci.edu.ar");

        Direccion d1 = new Direccion();
        d1.setCalle("Calle Falsa 123");
        d1.setCiudad("Ciudad Falsa 123");
        d1.setPersona(persona);

        Direccion d2 = new Direccion();
        d2.setCalle("Calle Verdadera 123");
        d2.setCiudad("Ciudad Verdadera 123");
        d2.setPersona(persona);

        persona.setDirecciones(List.of(d1, d2));

        Telefono tel1 = new Telefono();
        tel1.setNumero("123456789");
        tel1.setTipo("Personal");

        Telefono tel2 = new Telefono();
        tel2.setNumero("987654321");
        tel2.setTipo("Trabajo");

        persona.setTelefonos(Arrays.asList(tel1, tel2));

        entityManager.persist(persona);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}