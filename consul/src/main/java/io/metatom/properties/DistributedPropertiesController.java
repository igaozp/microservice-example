package io.metatom.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author igaozp
 * @since 2020/8/20
 */
@RestController
public class DistributedPropertiesController {
    @Value("${my.prop}")
    String value;

    @Resource
    private MyProperties properties;

    @GetMapping("/getConfigFromValue")
    public String getConfigFromValue() {
        return value;
    }

    @GetMapping("/getConfigFromProperty")
    public String getConfigFromProperty() {
        return properties.getProp();
    }
}
