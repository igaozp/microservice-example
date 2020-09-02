package io.metatom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Zookeeper client application
 *
 * @author igaozp
 * @since 2020/9/2
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperClientApplication.class, args);
    }
}
