package com.csra.dozer.converter;

import com.csra.fhir.Date;
import org.dozer.CustomConverter;
import org.dozer.MappingException;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by steffen on 12/15/16.
 */
public class ChcsFhirDateCustomConverter implements CustomConverter {

    public Object convert(Object destination, Object source, Class destinationClass, Class sourceClass) {
        if (source == null) {
            return null;
        }

        if (source instanceof java.sql.Timestamp) {
            com.csra.fhir.Date date = new com.csra.fhir.Date();
            date.setValue(source.toString());
            return null;
        } else if (source instanceof com.csra.fhir.Date) {
            Timestamp ts = null;
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");
            try {
                java.util.Date date = format.parse(((Date) source).getValue());
                ts = new Timestamp(date.getTime());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ts;
        } else {
            throw new MappingException("Converter ChcsFhirDateCustomConverter "
                    + "used incorrectly. Arguments passed in were:"
                    + destination + " and " + source);
        }
    }
}