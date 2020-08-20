package io.metatom.health;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Consul service discovery application
 *
 * @author igaozp
 * @since  2020/8/19
 */
@SpringBootApplication
public class ServiceDiscoveryApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceDiscoveryApplication.class).web(WebApplicationType.SERVLET)
                .run(args);
    }
}
