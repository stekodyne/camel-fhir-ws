package com.csra.service;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by steffen on 12/11/16.
 */
public class StubServiceTest {
    @Test
    public void testGetObject() throws Exception {
        StubService stubService = new StubService();

        assertNotNull(stubService.getObject("patient"));
        assertNotNull(stubService.getObject("bundle"));
        assertNull(stubService.getObject(""));
    }

}