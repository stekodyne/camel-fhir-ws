package com.csra.dao;

import com.csra.model.chcs.Observation;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ObservationDao {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public boolean postObservation(String id, String body) throws Exception {
        List<com.csra.model.chcs.Patient> patients = null;
        patients = entityManager.createQuery("from Patient p").getResultList();

        return true;
    }

    @Transactional
    public List<Observation> getObservations(String id) throws Exception {
        List<Observation> observations = null;
        observations = entityManager.createQuery("from Observation d where d.patientId = :id").setParameter("id", id).getResultList();

        return observations;
    }

}
