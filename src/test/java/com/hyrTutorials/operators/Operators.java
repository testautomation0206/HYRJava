package com.hyrTutorials.operators;

import java.sql.SQLOutput;

public class Operators {
    public static void main(String[] args){
        /*Arithmetic operators*/
        int i=20;
        int j=10;
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j);
        System.out.println(i%j);
        /*Unary operators*/
        System.out.println(i);
        System.out.println("Preincrement"+ ++i);
        System.out.println("post increment"+ i++);
        System.out.println(i);
        //22
        System.out.println("pre decrement"+--i);
        //---21
        System.out.println(i);
        //21
        System.out.println("post decrement"+i--);
        //21
        System.out.println(i);
        //20
        /**/
        System.out.println(i==j);
        System.out.println(i!=j);
        System.out.println(i>j);

    }
}
