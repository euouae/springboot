package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:appContext.xml")
public class Demo {

	public static void main(String[] args) {
		SpringApplication.run(Demo.class, args);

	}

}
