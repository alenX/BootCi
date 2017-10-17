package org.wangss.bootci.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.jwt")
@Data
public class AppJwtConfigProp {
    private String token;
}
