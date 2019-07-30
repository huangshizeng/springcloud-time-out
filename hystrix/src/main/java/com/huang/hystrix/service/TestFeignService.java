package com.huang.hystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-client", fallback = TestFeignServiceImpl.class)
@Repository
public interface TestFeignService {

    @RequestMapping("/test")
    String test();
}
