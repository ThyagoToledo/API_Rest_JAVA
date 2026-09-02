package com.nolte.javaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class JavaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaApiApplication.class, args);
    }

}
