package com.dark;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration//scan at startup
public class AppConfig {
    private String myVar;



    @Bean
    public FirstClass myFirstClassObject(){
        return new FirstClass("FISRY BEAN");
    }
    @Bean
    @Qualifier("bean2")
    public FirstClass mySeondClassObject(){
        return new FirstClass("Seconf BEAN");
    }
    @Bean
    @Primary
    public FirstClass myThirdObject(){
        return new FirstClass("Seconf BEAN");
    }
}
