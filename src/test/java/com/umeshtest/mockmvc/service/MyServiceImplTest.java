package com.umeshtest.mockmvc.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyServiceImplTest {

    @Test
    public void testGetMessage() {
        MyService myService = new MyServiceImpl();
        String result = myService.getMessage();
        assertEquals("this is a sample text", result);
    }

}