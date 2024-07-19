package com.hyrTutorials.conditionalStatements;

import java.util.Scanner;

public class Switch {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i =  sc.nextInt();
    switch (i){
        case 1:
            System.out.println("This is the first statement");
           // break;
        case 2:
            System.out.println("This is the second statement");
           // break;
        case 3:
            System.out.println("This is the Third statement");
            break;
        default:
            System.err.println("This is Invalid input");
            break;
    }
}
}
