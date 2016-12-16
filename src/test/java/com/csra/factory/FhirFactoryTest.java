package com.csra.factory;

import com.csra.fhir.Patient;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * Created by steffen on 12/11/16.
 */
public class FhirFactoryTest {
    @Test
    public void testGetPatient() throws Exception {
        assertThat(FhirFactory.getObject("patient"), instanceOf(Patient.class));
    }
}