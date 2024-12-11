package dev.padron.suggestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan (basePackages = "dev.padron.suggestion")
@EntityScan (basePackages = "dev.padron.suggestion.entities")
@EnableJpaRepositories (basePackages = "dev.padron.suggestion.repos")

public class SuggestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuggestionApplication.class, args);
	}

}
