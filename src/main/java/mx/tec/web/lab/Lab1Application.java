/*
 * Lab1Application
 * Version 1.0
 * August 14, 2021 
 * Copyright 2021 Tecnologico de Monterrey
 */
package mx.tec.web.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class that triggers auto-configuration and component scanning
 * @author Enrique Sanchez
 * @version 1.0
 */
@SpringBootApplication
public class Lab1Application {
	/**
	 * Entry point of the Spring Boot Application
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

}
