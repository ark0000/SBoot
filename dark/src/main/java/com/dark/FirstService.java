package com.dark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySources({
        @PropertySource("classpath:a.pr")
})

public class FirstService {

    private Environment enviro;
@Autowired
    private FirstClass myFirstClass;

    @Autowired
    @Qualifier("myFirstClassObject")
    private FirstClass FirstClass;

    public String sayStory(){
       return "Story is "+myFirstClass + "  "+FirstClass;
    }


@Autowired
    public void setEnviro(Environment enviro) {
        this.enviro = enviro;
    }
    public String getVersion(){
        return "Story is java "+enviro.getProperty("java.version");
    }
@Value("${myop.pp}")
  private   String custProp;


    public String getCustProp() {
        return custProp;
    }
}
