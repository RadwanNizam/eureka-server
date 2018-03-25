package org.nizam.radwan.microservice.email;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"org.nizam.radwan.microservice.commons.service",
		"org.nizam.radwan.microservice.email.service",
		"org.nizam.radwan.microservice.email.controller"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}