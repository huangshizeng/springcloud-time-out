package com.huang.hystrix.service;

import org.springframework.stereotype.Component;

/**
 * @author hsz
 */

@Component
public class TestFeignServiceImpl implements TestFeignService {

    @Override
    public String test() {
        return "error";
    }
}
