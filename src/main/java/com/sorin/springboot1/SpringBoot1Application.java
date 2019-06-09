package com.sorin.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ImportResource("classpath:/spring/applicationContext.xml")
@EnableJpaRepositories("com.sorin.springboot1.email")
@EntityScan(basePackages="com.sorin.springboot1.email")
@ComponentScan(basePackages="com.sorin.springboot1.email")
public class SpringBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}

}
