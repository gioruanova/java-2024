package com.examplejpatest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.examplejpatest.clases.Direccion;

public class DireccionDAO {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public DireccionDAO() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TestJPA");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    // Método para buscar direcciones por persona ID
    public List<Direccion> buscarDireccionesPorPersonaId(Long personaId) {
        TypedQuery<Direccion> query = entityManager.createQuery(
                "SELECT d FROM Direccion d WHERE d.persona.id = :personaId", Direccion.class);
        query.setParameter("personaId", personaId);
        return query.getResultList();
    }

    // Método para cerrar el EntityManager
    public void cerrar() {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}
