package io.metatom.health;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ServiceDiscoveryController
 *
 * @author igaozp
 * @since 2020/8/20
 */
@RestController
public class ServiceDiscoveryController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/health-check")
    public ResponseEntity<String> myCustomCheck() {
        var message = "Testing health check function";
        // disable health check
        return new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
    }
}
