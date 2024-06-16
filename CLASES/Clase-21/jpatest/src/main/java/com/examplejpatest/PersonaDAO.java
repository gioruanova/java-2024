package com.examplejpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.examplejpatest.clases.Genero;
import com.examplejpatest.clases.Persona;

import java.util.List;
import java.util.Optional;

public class PersonaDAO {

    private EntityManager entityManager;

    public PersonaDAO() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestJPA");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    // Método para crear una persona
    public Persona crearPersona(String nombre, int edad, Genero genero) {
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setGenero(genero);

        entityManager.getTransaction().begin();
        entityManager.persist(persona);
        entityManager.getTransaction().commit();

        return persona;
    }

    // Método para obtener todas las personas
    public List<Persona> obtenerTodasLasPersonas() {
        TypedQuery<Persona> query = entityManager.createQuery("SELECT p FROM Persona p", Persona.class);
        return query.getResultList();
    }

    // Método para buscar una persona por su ID
    public Optional<Persona> buscarPersonaPorId(Long id) {
        Persona persona = entityManager.find(Persona.class, id);
        return Optional.ofNullable(persona);
    }

    // Método para actualizar una persona
    public Persona actualizarPersona(Long id, String nuevoNombre, int nuevaEdad, Genero nuevoGenero) {
        try {
            entityManager.getTransaction().begin();
            Persona persona = entityManager.find(Persona.class, id);
            if (persona != null) {
                persona.setNombre(nuevoNombre);
                persona.setEdad(nuevaEdad);
                persona.setGenero(nuevoGenero);
            }
            entityManager.getTransaction().commit();

            return persona;
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            // Puedes manejar la excepción aquí o relanzarla si es necesario
            throw new RuntimeException("Error al actualizar persona: " + e.getMessage(), e);
        } finally {
            // Asegurarse de cerrar el EntityManager
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    // Método para eliminar una persona
    public void eliminarPersona(Long id) {
        entityManager.getTransaction().begin();
        Persona persona = entityManager.find(Persona.class, id);
        if (persona != null) {
            entityManager.remove(persona);
        }
        entityManager.getTransaction().commit();
    }

    public void buscarDireccionesPorPersona(Persona persona) {

    }

    // Método para cerrar el EntityManager
    public void cerrar() {
        entityManager.close();
    }
}