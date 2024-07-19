package com.hyrTutorials.variables;

public class Student {
    static  int id1 = 102;
    int id = 101;
    /*static */

    public static void main(String[] args){
        Student s = new Student();
        System.out.println(s.id);
        System.out.println(id1);
        /*local variable*/
        int height = 40;
        System.out.println(height);

    }
}
