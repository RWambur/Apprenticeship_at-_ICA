package com.h2database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EntityScan("com.h2database.entity")
@SpringBootApplication
public class H2databaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2databaseApplication.class, args);
	}

}
