package io.metatom;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * FeignClient
 *
 * @author igaozp
 * @since 2020/8/17
 */
@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient {
    /**
     * get greeting info
     *
     * @return greeting info
     */
    @RequestMapping("/greeting")
    String greeting();
}
