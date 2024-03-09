package com.dark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {

        //SpringApplication.run(Main.class,args);---1
        //This return ConfigurableAppcontext
        var ctx=SpringApplication.run(Main.class,args);
//        FirstClass  f=new FirstClass();---1
//        FirstClass myFirstClassObject=ctx.getBean("myBean",FirstClass.class);
//        System.out.println(myFirstClassObject);
        FirstService firstService=ctx.getBean(com.dark.FirstService.class);
        System.out.println(firstService.sayStory());
    }
//@Bean
//public FirstClass myFirstClassObject(){
//        return new FirstClass();
//}
}

