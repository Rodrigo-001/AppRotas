package com.offlinenav.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.offlinenav.demo.repository")
public class demoJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(demoJavaApplication.class, args);
    }

}
