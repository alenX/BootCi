package org.wangss.bootci.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wangss
 */
@ConfigurationProperties(prefix = "app.jwt")
@Data
public class AppJwtConfigProp {

  private String token;
}
