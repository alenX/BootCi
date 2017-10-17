package org.wangss.bootci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.wangss.bootci.config.AppJwtConfigProp;

@SpringBootApplication
@EnableConfigurationProperties(value = AppJwtConfigProp.class)
public class BootciApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootciApplication.class, args);
    }
}
