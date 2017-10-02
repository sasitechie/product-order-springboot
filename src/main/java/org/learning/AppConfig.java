package org.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.learning")

public class AppConfig {
	public static void main(String args[]){
		SpringApplication.run(AppConfig.class, args);
	}

}
