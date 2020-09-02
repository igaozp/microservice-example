package io.metatom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author igaozp
 * @since 2020/9/2
 */
@EnableHystrix
@SpringBootApplication
public class HystrixCircuitBreakerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixCircuitBreakerApplication.class, args);
    }
}
