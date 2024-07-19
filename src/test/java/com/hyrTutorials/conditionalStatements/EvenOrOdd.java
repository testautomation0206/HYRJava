package com.hyrTutorials.conditionalStatements;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
