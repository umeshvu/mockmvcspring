package com.umeshtest.mockmvc.controller;

import com.umeshtest.mockmvc.service.MyService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @PostMapping("/message")
    public String getMessage() {
        return myService.getMessage();
    }
}
