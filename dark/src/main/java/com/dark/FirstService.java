package com.dark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    private final FirstClass myFirstClass;


    public FirstService(@Qualifier("bean2") FirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String sayStory(){
       return "Story is "+myFirstClass;
    }
}
