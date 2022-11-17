package com.company;

public class Head {
    public void think(){
        System.out.println("using " + toString() + " to think");
    }
    @Override
    public String toString() {
        return "head";
    }
}
