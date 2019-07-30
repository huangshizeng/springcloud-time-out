package com.huang.hystrix.controller;

import com.huang.hystrix.service.TestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestFeignService testFeignService;

    @Autowired
    public TestController(TestFeignService testFeignService) {
        this.testFeignService = testFeignService;
    }

    @GetMapping("/test")
    public String test() {
        return testFeignService.test();
    }
}
