package org.wangss.bootci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BootciApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootciApplication.class, args);
	}
}
