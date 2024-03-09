package com.dark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FirstService {
@Autowired
    private FirstClass myFirstClass;
    @Autowired
    @Qualifier("myFirstClassObject")
    private FirstClass FirstClass;

    public String sayStory(){
       return "Story is "+myFirstClass + "  "+FirstClass;
    }
}
