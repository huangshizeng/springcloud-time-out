package com.huang.feign.controller;

import com.huang.feign.service.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestFeign testFeign;

    @Autowired
    public TestController(TestFeign testFeign) {
        this.testFeign = testFeign;
    }

    @GetMapping("/test")
    public String test() {
        return testFeign.test();
    }
}
