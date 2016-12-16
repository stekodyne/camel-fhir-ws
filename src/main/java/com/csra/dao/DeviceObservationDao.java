package com.csra.dao;

import com.csra.dozer.bundler.FhirBundler;
import com.csra.fhir.Bundle;
import com.csra.fhir.DeviceMetric;
import com.csra.model.chcs.DeviceObservation;
import com.csra.model.chcs.Patient;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DeviceObservationDao {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public boolean postDeviceObservation(String id, String body) throws Exception {
        List<com.csra.model.chcs.Patient> patients = null;
        patients = entityManager.createQuery("from Patient p").getResultList();

        return true;
    }

    @Transactional
    public List<DeviceObservation> getDeviceObservations(String id) throws Exception {
        List<com.csra.model.chcs.DeviceObservation> observations = null;
        observations = entityManager.createQuery("from DeviceObservation d where d.ien = :id").setParameter("id", id).getResultList();

        return observations;
    }

}
