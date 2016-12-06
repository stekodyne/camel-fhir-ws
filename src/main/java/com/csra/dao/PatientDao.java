package com.csra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.apache.camel.BeanInject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.csra.fhir.Code;
import com.csra.fhir.HumanName;
import com.csra.fhir.Id;
import com.csra.fhir.Patient;

public class PatientDao {
	@BeanInject("chcsDs")
	SimpleDriverDataSource chcsDs;
	
	@Value("${patient.select.all}")
	private String patientsSql;
	
	@Value("${patient.select.single}")
	private String patientSql;
	
    public ArrayList<Patient> getPatients() throws Exception {
        ArrayList<Patient> patients = new ArrayList<Patient>();
        Connection connection = chcsDs.getConnection();
        PreparedStatement statement = connection.prepareStatement(patientsSql);
        ResultSet results = statement.executeQuery();

        while (results.next()) {
        	Patient patient = new Patient();

        	patient.setId(results.getString("ien"));
        	patient.setGender(results.getString("sex"));
        	HumanName name = new HumanName();
        	name.setText(results.getString("name"));
			name.getFamily().add(results.getString("name").split(",")[0]);
			name.getGiven().add(results.getString("name").split(",")[1]);
        	patient.getName().add(name);
        	
            patients.add(patient);
        }
        return patients;
    }
    
    public Patient getPatient(String ien) throws Exception {
        Patient patient = null;
        Connection connection = chcsDs.getConnection();
        PreparedStatement statement = connection.prepareStatement(patientSql);
        
        statement.setString(1, ien);
        ResultSet results = statement.executeQuery();
        
        while (results.next()) {
        	patient = new Patient();

			patient.setId(results.getString("ien"));
			patient.setGender(results.getString("sex"));
			HumanName name = new HumanName();
			name.setText(results.getString("name"));
			name.getFamily().add(results.getString("name").split(",")[0]);
			name.getGiven().add(results.getString("name").split(",")[1]);
			patient.getName().add(name);
			break;
        }
        
        return patient;
    }

}
