package com.dark;

public class FirstClass {
    private  String myVar;

    public FirstClass(String myVar) {
        this.myVar = myVar;
    }

    public  String sayhello(){
        return "Hello";
    }

    @Override
    public String toString() {
        return " VAR "+myVar;
    }
}
