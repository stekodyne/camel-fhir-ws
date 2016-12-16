package com.csra.camel;

import com.csra.fhir.Bundle;
import com.csra.fhir.Patient;
import com.csra.service.PatientService;
import com.csra.service.StubService;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.JndiRegistry;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by steffen on 12/7/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class CamelRouteTest extends RestletTestSupport {

    @Mock
    PatientService patientService;

    @Mock
    StubService stubService;

    private String patientId = "10";
    private String objectType = "order";

    @Test
    public void testPatientGetMethod() throws Exception {
        when(patientService.getPatient("10")).thenReturn(null);
        HttpResponse response = doExecute(new HttpGet("http://localhost:" + portNum + "/fhir/patient/" + patientId));
        verify(patientService).getPatient(patientId);
        assertHttpResponse(response, 200, "application/json+fhir", null);
    }

    @Test
    public void testPatientsGetMethod() throws Exception {
        when(patientService.getPatients()).thenReturn(null);
        HttpResponse response = doExecute(new HttpGet("http://localhost:" + portNum + "/fhir/patients"));
        verify(patientService).getPatients();
        assertHttpResponse(response, 200, "application/json+fhir", null);
    }

    @Test
    public void testStubGetMethod() throws Exception {
        when(stubService.getObject(objectType)).thenReturn(new Patient());
        HttpResponse response = doExecute(new HttpGet("http://localhost:" + portNum + "/fhir/" + objectType));
        verify(stubService).getObject(objectType);
        assertHttpResponse(response, 200, "application/json+fhir", "{}");
    }

    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                restConfiguration().component("restlet").host("localhost").port(portNum).bindingMode(RestBindingMode.auto).jsonDataFormat("json-gson");

                rest("/fhir")
                        .post("/echo").to("stream:out")
                        .get("/patient/{id}").outType(Patient.class).produces("application/json+fhir").to("bean:patientService?method=getPatient(${header.id})")
                        .get("/patients").outType(Bundle.class).produces("application/json+fhir").to("bean:patientService?method=getPatients()")
                        .get("/devices").outType(Bundle.class).produces("application/json+fhir").to("bean:deviceService?method=getDevices()")
                        .post("/device/{id}").outType(Bundle.class).produces("application/json+fhir").to("restlet:http://localhost:8181/fhir/echo?restletMethod=POST")
                        .get("/{object}").outType(Object.class).produces("application/json+fhir").to("bean:stubService?method=getObject(${header.object})");

            }
        };
    }

    @Override
    public JndiRegistry createRegistry() throws Exception {
        JndiRegistry registry = super.createRegistry();
        registry.bind("patientService", patientService);
        registry.bind("stubService", stubService);
        return registry;
    }
}