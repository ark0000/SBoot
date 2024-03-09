package com.dark;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//scan at startup
public class AppConfig {
    private String myVar;



    @Bean
    @Qualifier("bean1")
    public FirstClass myFirstClassObject(){
        return new FirstClass("FISRY BEAN");
    }
    @Bean
    @Qualifier("bean2") //
    public FirstClass mySeondClassObject(){
        return new FirstClass("Seconf BEAN");
    }
}
