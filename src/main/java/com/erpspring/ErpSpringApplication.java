package com.erpspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"it.unikey"})
@EntityScan("it.unikey.DAL")
@EnableJpaRepositories("it.unikey.DAL")
public class ErpSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ErpSpringApplication.class, args);
    }
}
