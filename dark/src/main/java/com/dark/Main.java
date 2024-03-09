package com.dark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {

        //SpringApplication.run(Main.class,args);---1
        //This return ConfigurableAppcontext
        var ctx=SpringApplication.run(Main.class,args);
//        FirstClass  f=new FirstClass();---1
        FirstClass myFirstClassObject=ctx.getBean(FirstClass.class);
        System.out.println(myFirstClassObject.sayhello());
    }
//@Bean
//public FirstClass myFirstClassObject(){
//        return new FirstClass();
//}
}

