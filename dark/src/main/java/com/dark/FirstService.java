package com.dark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    private Environment enviro;
@Autowired
    private FirstClass myFirstClass;

    @Autowired
    @Qualifier("myFirstClassObject")
    private FirstClass FirstClass;
@Autowired
    public void injectDependic(FirstClass myFirstClass){
       this.myFirstClass=myFirstClass;
    }

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
}
