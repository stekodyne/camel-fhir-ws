package com.csra.service;

import com.csra.fhir.Bundle;
import org.apache.camel.BeanInject;
import org.springframework.stereotype.Service;
import com.csra.dao.PatientDao;
import com.csra.fhir.Patient;

@Service("patientService")
public class PatientService {
	@BeanInject("patientDao")
	PatientDao patientDao;

	public Bundle getPatients() {
		Bundle patients = null;

		try {
			patients = patientDao.getPatients();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return patients;
	}

	public Patient getPatient(String ien) {
		Patient patient = null;

		try {
			patient = patientDao.getPatient(ien);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return patient;
	}

}
