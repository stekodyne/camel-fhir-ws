package com.csra.service;

import com.csra.dozer.bundler.FhirBundler;
import com.csra.fhir.Bundle;
import org.apache.camel.BeanInject;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;
import com.csra.dao.PatientDao;
import com.csra.fhir.Patient;

@Service("patientService")
public class PatientService {
	@BeanInject("patientDao")
	PatientDao patientDao;

	@BeanInject("mapper")
	Mapper mapper;

	public Bundle getPatients() {
        Bundle bundle = new Bundle();

		try {
            bundle = FhirBundler.createPatientBundle(mapper, patientDao.getPatients());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bundle;
	}

	public Patient getPatient(String id) {
		Patient patient = null;

		try {
			patient = mapper.map(patientDao.getPatient(id), com.csra.fhir.Patient.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return patient;
	}

}
