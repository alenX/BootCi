package org.wangss.bootci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.wangss.bootci.config.AppJwtConfigProp;

@SpringBootApplication
@EnableConfigurationProperties(value = AppJwtConfigProp.class)
@EnableTransactionManagement
public class BootciApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootciApplication.class, args);
    }
}
