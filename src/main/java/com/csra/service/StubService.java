package com.csra.service;

import org.springframework.stereotype.Service;
import com.csra.factory.FhirFactory;

@Service("stubService")
public class StubService {

	public Object getObject(String object) {
		return FhirFactory.getObject(object);
	}

}
