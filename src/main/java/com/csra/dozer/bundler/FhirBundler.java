package com.csra.dozer.bundler;

import com.csra.fhir.Bundle;
import com.csra.fhir.BundleEntry;
import com.csra.fhir.BundleType;
import com.csra.fhir.BundleTypeList;
import com.csra.fhir.ResourceContainer;
import com.csra.model.chcs.Observation;
import org.dozer.Mapper;
import java.util.List;

/**
 * Created by steffen on 12/15/16.
 */
public class FhirBundler {
    public static Bundle createPatientBundle(Mapper mapper, List<com.csra.model.chcs.Patient> resources) {
        Bundle bundle = new Bundle();
        BundleType bundleType = new BundleType();
        bundleType.setValue(BundleTypeList.COLLECTION);
        bundle.setType(bundleType);

        for(com.csra.model.chcs.Patient resource : resources) {
            BundleEntry bundleEntry = new BundleEntry();
            ResourceContainer resourceContainer = new ResourceContainer();
            bundleEntry.setResource(resourceContainer);
            bundleEntry.getResource().setPatient(mapper.map(resource, com.csra.fhir.Patient.class));
            bundle.getEntry().add(bundleEntry);
        }

        return bundle;
    }

    public static Bundle createObservationBundle(Mapper mapper, List<Observation> resources) {
        Bundle bundle = new Bundle();
        BundleType bundleType = new BundleType();
        bundleType.setValue(BundleTypeList.COLLECTION);
        bundle.setType(bundleType);

        for(Observation resource : resources) {
            BundleEntry bundleEntry = new BundleEntry();
            ResourceContainer resourceContainer = new ResourceContainer();
            bundleEntry.setResource(resourceContainer);
            bundleEntry.getResource().setObservation(mapper.map(resource, com.csra.fhir.Observation.class));
            bundle.getEntry().add(bundleEntry);
        }

        return bundle;
    }
}
