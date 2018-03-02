package io.keely.fantasycalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FantasyCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FantasyCalculatorApplication.class, args);
	}
}
