package io.metatom.discovery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Consul discovery client application
 *
 * @author igaozp
 * @since  2020/8/20
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DiscoveryClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DiscoveryClientApplication.class)
                .run(args);
    }
}
