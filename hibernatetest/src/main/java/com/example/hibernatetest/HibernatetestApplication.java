package com.example.hibernatetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class HibernatetestApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernatetestApplication.class, args);
    }

}

