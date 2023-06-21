package com.project.encuestabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories("com.project.encuestabackend.repository")
public class EncuestabackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(EncuestabackendApplication.class, args);

		System.out.println("hola");
	}

}
