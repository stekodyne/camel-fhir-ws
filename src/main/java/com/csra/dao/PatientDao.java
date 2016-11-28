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
        	
        	Id id = new Id();
        	id.setId(results.getString("ien"));
        	patient.setId(id);
        	
        	Code code = new Code();
        	code.setValue(results.getString("sex"));
        	patient.setGender(code);
        	
        	HumanName name = new HumanName();
        	com.csra.fhir.String fullName = new com.csra.fhir.String();
        	fullName.setValue(results.getString("name"));
        	name.setText(fullName);
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
        	
        	Id id = new Id();
        	id.setId(results.getString("ien"));
        	patient.setId(id);
        	
        	Code code = new Code();
        	code.setValue(results.getString("sex"));
        	patient.setGender(code);
        	
        	HumanName name = new HumanName();
        	com.csra.fhir.String fullName = new com.csra.fhir.String();
        	fullName.setValue(results.getString("name"));
        	name.setText(fullName);
        	patient.getName().add(name);
        }
        
        return patient;
    }

}
