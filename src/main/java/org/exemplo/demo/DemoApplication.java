package org.exemplo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//Classe principal da aplicação Spring Boot
public class DemoApplication {

	//Método principal que inicia a aplicação Spring Boot
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
