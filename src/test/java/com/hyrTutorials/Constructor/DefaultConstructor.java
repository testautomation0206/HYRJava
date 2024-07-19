package com.hyrTutorials.Constructor;

public class DefaultConstructor {
    String color;
    int wheels;
    public void run(){
        System.out.println("running");
    }
    public static void main(String[] args){
        DefaultConstructor df = new DefaultConstructor();
        df.color = "red";
        System.out.println(df.color);
        df.wheels = 4;
        System.out.println(df.wheels);
        df.run();
    }
}
