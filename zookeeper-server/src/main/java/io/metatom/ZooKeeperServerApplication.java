package io.metatom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ZooKeeper server provider application
 *
 * @author igaozp
 * @since 2020/8/31
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ZooKeeperServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZooKeeperServerApplication.class, args);
    }

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World!";
    }
}
