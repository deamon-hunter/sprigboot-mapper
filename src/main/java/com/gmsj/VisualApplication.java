package com.gmsj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class VisualApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisualApplication.class, args);
	}
}
