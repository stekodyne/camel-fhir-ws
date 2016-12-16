package com.csra.dozer.converter;

import com.csra.fhir.HumanName;
import org.dozer.CustomConverter;
import org.dozer.MappingException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by steffen on 12/15/16.
 */
public class HumanNameCustomConverter implements CustomConverter {

    public Object convert(Object destination, Object source, Class destinationClass, Class sourceClass) {
        if (source == null) {
            return null;
        }

        if (source instanceof String) {
            List<HumanName> names = new ArrayList<HumanName>();
            HumanName name = new HumanName();
            String[] nameTokens = ((String) source).split(",");
            name.setText((String) source);
            name.getFamily().add(nameTokens[0]);
            name.getGiven().add(nameTokens[1]);
            names.add(name);
            return names;
        } else if (source instanceof List) {
            HumanName name = (HumanName) ((List) source).get(0);
            return new String(name.getText());
        } else {
            throw new MappingException("Converter HumanNameCustomConverter "
                    + "used incorrectly. Arguments passed in were:"
                    + destination + " and " + source);
        }
    }
}