package com.sample.springoauth2jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sample.springoauth2jwt.configuration.boot.CreateDefaultUserListener;

@SpringBootApplication
public class AuthorizationServerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(AuthorizationServerApplication.class, args);
		ctx.getBean(CreateDefaultUserListener.class);
	}
}
