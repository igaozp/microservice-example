package io.metatom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author igaozp
 * @since 2020/9/2
 */
@RestController
public class HelloWorldController {
    @Resource
    private HelloWorldClient client;

    @GetMapping("hello")
    public String hello() {
        return client.helloWorld();
    }
}
