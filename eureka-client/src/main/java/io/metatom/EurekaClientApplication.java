package io.metatom;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * EurekaClientApplication
 *
 * @author igaozp
 * @since  2020/8/17
 */
@SpringBootApplication
@RestController
public class EurekaClientApplication implements GreetingController {
    @Lazy
    @Resource
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    @Override
    public String greeting() {
        return String.format(
                "Hello from '%s'!", eurekaClient.getApplication(appName).getName());
    }
}
