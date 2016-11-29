package com.csra.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

import com.csra.fhir.Patient;

public class CamelRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		restConfiguration().component("restlet").host("localhost").port(8182).bindingMode(RestBindingMode.auto);

		rest("/fhir")
			.get("/patient/{ein}").outType(Patient.class).produces("application/json+fhir").to("bean:patientService?method=getPatient(${header.ein})")
			.get("/patients").outTypeList(Patient.class).produces("application/json+fhir").to("bean:patientService?method=getPatients()")
			.get("/{object}").outType(Object.class).produces("application/json+fhir").to("bean:stubService?method=getObject(${header.object})");
	}

}
