package com.umeshtest.mockmvc.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Override
    public String getMessage() {
        return "this is a sample text";
    }
}
