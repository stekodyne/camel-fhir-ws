package com.csra.service;

import com.csra.dao.DeviceObservationDao;
import com.csra.dozer.bundler.FhirBundler;
import com.csra.fhir.Bundle;
import com.csra.fhir.DeviceMetric;
import com.csra.fhir.Patient;
import org.apache.camel.BeanInject;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

@Service("deviceService")
public class DeviceObservationService {
	@BeanInject("deviceObservationDao")
	DeviceObservationDao deviceObservationDao;

	@BeanInject("mapper")
	Mapper mapper;

	public Bundle getDeviceObservations(String id) {
		Bundle bundle = new Bundle();

		try {
			bundle = FhirBundler.createDeviceObservationBundle(mapper, deviceObservationDao.getDeviceObservations(id));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bundle;
	}

	public boolean postDeviceObservation(String id, String body) {
		boolean status = false;

		try {
			status = deviceObservationDao.postDeviceObservation(id, body);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

}
