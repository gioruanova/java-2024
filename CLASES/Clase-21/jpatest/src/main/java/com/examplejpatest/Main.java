package com.examplejpatest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.examplejpatest.clases.Direccion;
// import com.examplejpatest.clases.Direccion;
import com.examplejpatest.clases.Genero;
import com.examplejpatest.clases.Persona;
// import com.examplejpatest.clases.Telefono;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Persona persona = new Persona();
        // persona.setId(11L);
        persona.setNombre("Juan");
        persona.setEdad(30);
        persona.setGenero(Genero.MASCULINO);

        entityManager.persist(persona);
        entityManager.getTransaction().commit();

        // em.close();
        // emf.close();
        //
        PersonaDAO personaDAO = new PersonaDAO();

        // Telefono tel1 = new Telefono();
        // tel1.setNumero("123456789");
        // tel1.setTipo("Personal");

        // Telefono tel2 = new Telefono();
        // tel2.setNumero("987654321");
        // tel2.setTipo("Trabajo");

        // persona.setTelefonos(Arrays.asList(tel1, tel2));

        entityManager.getTransaction().begin();
        entityManager.persist(persona);
        entityManager.getTransaction().commit();

        // Crear una persona
        // Persona persona = new Persona();
        // persona.setNombre("Juan");
        // persona.setEdad(30);
        // persona.setGenero(Genero.MASCULINO);

        // // Crear una dirección
        Direccion direccion1 = new Direccion();
        direccion1.setCalle("Calle Principal");
        direccion1.setCiudad("Ciudad Principal");
        direccion1.setPersona(persona); // Establecer la relación

        // // Agregar la dirección a la lista de direcciones de la persona
        persona.setDirecciones(List.of(direccion1));

        // // Guardar persona y dirección en la base de datos
        entityManager.getTransaction().begin();
        entityManager.persist(persona);
        entityManager.getTransaction().commit();

        // // Cerrar EntityManager y EntityManagerFactory al finalizar
        entityManager.close();
        entityManagerFactory.close();

        System.out.println("----------------------------------------------------");

        // Crear una persona
        // personaDAO.crearPersona("Juan", 25, Genero.MASCULINO);

        // // Obtener todas las personas
        // List<Persona> personas = personaDAO.obtenerTodasLasPersonas();
        // System.out.println("Lista de personas:");
        // for (Persona persona : personas) {
        // System.out.println(persona.getId() + ", " + persona.getNombre() + ", " +
        // persona.getEdad() + ", "
        // + persona.getGenero());
        // }

        // // Buscar una persona por su ID
        // Optional<Persona> personaOptional = personaDAO.buscarPersonaPorId(33L);
        // personaOptional.ifPresent(persona -> {
        // System.out.println("Persona encontrada por ID: " + persona.getId() + ", " +
        // persona.getNombre() + ", "
        // + persona.getEdad() + ", " + persona.getGenero());
        // });

        // if (personaOptional.isPresent()) {
        // Persona persona = personaOptional.get();
        // System.out.println("Persona encontrada por ID: " + persona.getId() + ", " +
        // persona.getNombre() + ", "
        // + persona.getEdad() + ", " + persona.getGenero());
        // } else {
        // System.out.println("Persona no encontrada");
        // }

        // Actualizar una persona
        // personaDAO.actualizarPersona(1L, "Juan Pérez", 30, Genero.MASCULINO);

        // // Eliminar una persona
        // personaDAO.eliminarPersona(1L);

        // // Cerrar el EntityManager al finalizar
        // personaDAO.cerrar();

        System.out.println("----------------------------------------------------");
        // PersonaDAO dao = PersonaDAO.getInstance();

        // // Ahora puedes usar los métodos del DAO
        // Persona nuevaPersona = dao.crearPersona("Juan", 30, Genero.MASCULINO);
        // List<Persona> personas = dao.obtenerTodasLasPersonas();
        // Optional<Persona> personaEncontrada = dao.buscarPersonaPorId(1L);

        // // Cerrar el EntityManager cuando ya no se necesite
        // dao.cerrar();
    }

}