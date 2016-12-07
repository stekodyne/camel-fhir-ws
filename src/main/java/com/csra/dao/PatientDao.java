package com.csra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.csra.fhir.Bundle;
import com.csra.fhir.BundleEntry;
import com.csra.fhir.BundleType;
import com.csra.fhir.BundleTypeList;
import com.csra.fhir.Patient;
import com.csra.fhir.ResourceContainer;
import org.apache.camel.BeanInject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class PatientDao {
	@BeanInject("chcsDs")
	SimpleDriverDataSource chcsDs;
	
	@Value("${patient.select.all}")
	private String patientsSql;
	
	@Value("${patient.select.single}")
	private String patientSql;
	
    public Bundle getPatients() throws Exception {
        Bundle patients = new Bundle();
		BundleType bundleType = new BundleType();
		bundleType.setValue(BundleTypeList.COLLECTION);
		patients.setType(bundleType);

        Connection connection = chcsDs.getConnection();
        PreparedStatement statement = connection.prepareStatement(patientsSql);
        ResultSet results = statement.executeQuery();

        while (results.next()) {
			BundleEntry bundleEntry = new BundleEntry();
			ResourceContainer resourceContainer = new ResourceContainer();
			bundleEntry.setResource(resourceContainer);
        	Patient patient = new Patient();

        	patient.setId(results.getString("ien"));
        	patient.setGender(results.getString("sex"));
        	com.csra.fhir.HumanName name = new com.csra.fhir.HumanName();
        	name.setText(results.getString("name"));
			name.getFamily().add(results.getString("name").split(",")[0]);
			name.getGiven().add(results.getString("name").split(",")[1]);
        	patient.getName().add(name);

			bundleEntry.getResource().setPatient(patient);
			patients.getEntry().add(bundleEntry);
        }

        return patients;
    }
    
    public Patient getPatient(String ien) throws Exception {
        com.csra.fhir.Patient patient = null;
        Connection connection = chcsDs.getConnection();
        PreparedStatement statement = connection.prepareStatement(patientSql);
        
        statement.setString(1, ien);
        ResultSet results = statement.executeQuery();
        
        while (results.next()) {
        	patient = new com.csra.fhir.Patient();

			patient.setId(results.getString("ien"));
			patient.setGender(results.getString("sex"));
			com.csra.fhir.HumanName name = new com.csra.fhir.HumanName();
			name.setText(results.getString("name"));
			name.getFamily().add(results.getString("name").split(",")[0]);
			name.getGiven().add(results.getString("name").split(",")[1]);
			patient.getName().add(name);
			break;
        }
        
        return patient;
    }

}
