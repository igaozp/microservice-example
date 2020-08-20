package io.metatom.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * properties
 *
 * @author igaozp
 * @since 2020/8/20
 */
@RefreshScope
@Configuration
@ConfigurationProperties("my")
public class MyProperties {
    private String prop;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }
}
