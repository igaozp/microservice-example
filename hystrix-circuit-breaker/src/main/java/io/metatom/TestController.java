package io.metatom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping("fallbackTest")
    public Long fallbackTest() {
        return testService.getNumber();
    }

    @GetMapping("circuitBreakerTest")
    public Long circuitBreakerTest() {
        return testService.getRandomNumber();
    }
}
