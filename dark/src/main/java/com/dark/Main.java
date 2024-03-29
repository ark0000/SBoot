package com.dark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@EnableAutoConfiguration
@Configuration
@ComponentScan
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);

    }
}

