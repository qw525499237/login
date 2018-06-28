package com.text.land3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Land3Application {
    public static void main(String[] args) {
        SpringApplication.run(Land3Application.class, args);
    }
}
