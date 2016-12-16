package com.csra.service;

import com.csra.dao.ObservationDao;
import com.csra.dozer.bundler.FhirBundler;
import com.csra.fhir.Bundle;
import org.apache.camel.BeanInject;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

@Service("deviceService")
public class ObservationService {
	@BeanInject("observationDao")
	ObservationDao observationDao;

	@BeanInject("mapper")
	Mapper mapper;

	public Bundle getObservations(String id) {
		Bundle bundle = new Bundle();

		try {
			bundle = FhirBundler.createObservationBundle(mapper, observationDao.getObservations(id));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bundle;
	}

	public boolean postObservation(String id, String body) {
		boolean status = false;

		try {
			status = observationDao.postObservation(id, body);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

}
