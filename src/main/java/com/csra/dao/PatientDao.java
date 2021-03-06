package com.csra.dao;

import com.csra.model.chcs.Patient;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PatientDao {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public List<Patient> getPatients() throws Exception {
        List<com.csra.model.chcs.Patient> patients = null;
        patients = entityManager.createQuery("from Patient p").getResultList();

        return patients;
    }

    @Transactional
    public Patient getPatient(String id) throws Exception {
        List<com.csra.model.chcs.Patient> patients = null;
        patients = entityManager.createQuery("from Patient p where p.ien = :id").setParameter("id", id).getResultList();

        return patients.get(0);
    }

}
