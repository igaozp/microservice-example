package io.metatom;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author igaozp
 * @since 2020/9/2
 */
@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class HelloWorldClient {
    @Resource
    private TheClient theClient;

    @FeignClient(name = "zookeeper-server")
    interface TheClient {
        /**
         * Hello World
         *
         * @return Response
         */
        @GetMapping("/helloWorld")
        @ResponseBody
        String helloWorld();
    }

    public String helloWorld() {
        return theClient.helloWorld();
    }
}
