package com.csra.camel;

import java.io.IOException;

import org.apache.camel.test.AvailablePortFinder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.BeforeClass;


/**
 * Created by steffen on 12/8/16.
 */

public abstract class RestletTestSupport extends CamelTestSupport {
    protected static int portNum;

    @BeforeClass
    public static void initializePortNum() {
        portNum = AvailablePortFinder.getNextAvailable();
    }

    public HttpResponse doExecute(HttpUriRequest method) throws Exception {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        try {
            HttpResponse response = client.execute(method);
            response.setEntity(new BufferedHttpEntity(response.getEntity()));
            return response;
        } finally {
            client.close();
        }
    }

    public static void assertHttpResponse(HttpResponse response, int expectedStatusCode,
                                          String expectedContentType) throws ParseException, IOException {
        assertHttpResponse(response, expectedStatusCode, expectedContentType, null);
    }

    public static void assertHttpResponse(HttpResponse response, int expectedStatusCode,
                                          String expectedContentType, String expectedBody)
        throws ParseException, IOException {
        assertEquals(expectedStatusCode, response.getStatusLine().getStatusCode());
        assertTrue(response.getFirstHeader("Content-Type").getValue().startsWith(expectedContentType));
        if (expectedBody != null) {
            assertEquals(expectedBody, EntityUtils.toString(response.getEntity()));
        }
    }
}
