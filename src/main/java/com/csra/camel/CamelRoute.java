package com.csra.camel;

import com.csra.fhir.Bundle;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import com.csra.fhir.Patient;

import static org.apache.camel.builder.ProcessorBuilder.setHeader;

public class CamelRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		restConfiguration().component("restlet").host("localhost").port(8181).bindingMode(RestBindingMode.auto).jsonDataFormat("json-gson");

		rest("/fhir")
			.post("/echo").to("stream:out")
			.get("/patient/{ein}").outType(Patient.class).produces("application/json+fhir").to("bean:patientService?method=getPatient(${header.ein})")
			.get("/patients").outType(Bundle.class).produces("application/json+fhir").to("bean:patientService?method=getPatients()")
			.post("/device/{id}").outType(Bundle.class).produces("application/json+fhir").to("restlet:http://localhost:8181/fhir/echo?restletMethod=POST")
			.get("/{object}").outType(Object.class).produces("application/json+fhir").to("bean:stubService?method=getObject(${header.object})");
	}

}
