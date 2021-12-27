package com.adam.languages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.adam.languages.controllers"})
public class LanguagesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanguagesApplication.class, args);
	}

}
