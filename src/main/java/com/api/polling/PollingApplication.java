package com.api.polling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(value = {"com.api"})
@EntityScan(value = {"com.api"})
@EnableJpaRepositories("com.api")
public class PollingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PollingApplication.class, args);
	}

}
