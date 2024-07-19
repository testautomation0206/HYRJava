package com.hyrTutorials;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int i =  sc.nextInt();
//        System.out.println(i*5);
        String name = sc.nextLine();
        System.out.printf("Hey %s,How are you",name);
        sc.close();
    }
}
