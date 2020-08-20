package io.metatom.properties;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RestController;

/**
 * Consul distributed properties application
 *
 * @author igaozp
 * @since 2020/8/20
 */
@RestController
@SpringBootApplication
public class DistributedPropertiesApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DistributedPropertiesApplication.class)
                .run(args);
    }
}
