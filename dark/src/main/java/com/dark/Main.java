package com.dark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
    @GetMapping("/")
    public String greet(@RequestParam(value = "name",defaultValue = "Hello") String nameData){
        return "Hello";
    }

}


/*
* @SpringBootApplication
*SPringBootApplication
* @configuration@Enableautocofig@componentscan
*config the class as appcoonfig
* create beans
* bean dependant on another bean
* db username psswd class binds into bean
*@Enableautocofig
*makes spring to guess the config based on jar filrs
* figureout whatlib abd pre config
* @ComponentScan
* tells spring search for component
*@Configuration bean to instatiate
*
* @ComponentScan(basePackages = "com.dark")
*
* */
/*
@Confifguration as appconfig
* db of connections usr pssd
* class that binds properties into your class or bean
@EnableAutoConfig
* makes spring to guess the config based on jar files on CP
@ComponentScan
*look for components
default where manin class is search
*/