package com.hyrTutorials.operators;

public class AssignmentOperators {
    public static void main(String[] args){
        int i=20;
        int j=6;
        System.out.println(i+=5);
        System.out.println(i-=3);
        System.out.println(i);
        System.out.println(i*=5);
        System.out.println(i/=5);
        //below is the reminder
        System.out.println(i%=5);
        int k= i++ + ++i + i-- - --i;
        System.out.println(k);
    }
}
