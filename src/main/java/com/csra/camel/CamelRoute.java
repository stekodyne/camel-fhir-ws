package com.csra.camel;

import com.csra.fhir.Bundle;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import com.csra.fhir.Patient;

public class CamelRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		restConfiguration().component("restlet").host("localhost").port(8181).bindingMode(RestBindingMode.auto).jsonDataFormat("json-gson");

		rest("/fhir")
			.post("/echo").to("stream:out")
            .get("/observation/{id}").outType(Bundle.class).produces("application/json+fhir").to("bean:observationService?method=getObservations(${header.id})")
            .post("/observation/{id}").outType(Bundle.class).produces("application/json+fhir").to("bean:observationService?method=postObservation(${header.id}, ${in.body})")
            .get("/patient/{id}").outType(Patient.class).produces("application/json+fhir").to("bean:patientService?method=getPatient(${header.id})")
			.get("/patients").outType(Bundle.class).produces("application/json+fhir").to("bean:patientService?method=getPatients()")
            .get("/{object}").outType(Object.class).produces("application/json+fhir").to("bean:stubService?method=getObject(${header.object})");
	}

}
