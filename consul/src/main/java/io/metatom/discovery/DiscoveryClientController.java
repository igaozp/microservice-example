package io.metatom.discovery;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.naming.ServiceUnavailableException;
import java.net.URI;
import java.util.Optional;

/**
 * DiscoveryClientController
 *
 * @author igaozp
 * @since 2020/8/20
 */
@RestController
public class DiscoveryClientController {
    @Resource
    private DiscoveryClient discoveryClient;

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/discoveryClient")
    public String discoveryPing() throws ServiceUnavailableException {
        var service = serviceUrl().map(s -> s.resolve("/ping")).orElseThrow(ServiceUnavailableException::new);
        return restTemplate.getForEntity(service, String.class).getBody();
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/health-check")
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private Optional<URI> serviceUrl() {
        return discoveryClient.getInstances("myApp")
                .stream().findFirst().map(ServiceInstance::getUri);
    }
}
