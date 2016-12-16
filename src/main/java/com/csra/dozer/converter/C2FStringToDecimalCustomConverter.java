package com.csra.dozer.converter;

import com.csra.fhir.Decimal;
import com.csra.fhir.HumanName;
import org.dozer.CustomConverter;
import org.dozer.MappingException;

import java.math.BigDecimal;
import java.util.List;


/**
 * Created by steffen on 12/15/16.
 */
public class C2FStringToDecimalCustomConverter implements CustomConverter {

    public Object convert(Object destination, Object source, Class destinationClass, Class sourceClass) {
        if (source == null) {
            return null;
        }

        if (source instanceof String) {
            com.csra.fhir.Decimal value = new com.csra.fhir.Decimal();
            value.setValue(BigDecimal.valueOf(Double.valueOf((String) source)));

            return value;
        } else if (source instanceof com.csra.fhir.Decimal) {
            return ((Decimal) source).getValue().toString();
        } else {
            throw new MappingException("Converter C2FStringToDecimalCustomConverter "
                    + "used incorrectly. Arguments passed in were:"
                    + destination + " and " + source);
        }
    }
}