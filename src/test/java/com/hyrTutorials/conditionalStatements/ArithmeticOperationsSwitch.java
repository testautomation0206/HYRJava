package com.hyrTutorials.conditionalStatements;

import java.util.Scanner;

public class ArithmeticOperationsSwitch {
    public static void main(String[] args){
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int  i = sc.nextInt();
        System.out.println("Enter Second number");
        int  j = sc.nextInt();
        System.out.println("Choose an operator: +, -, *, or /");
        char Operator = sc.next().charAt(0);
        switch(Operator){
            case '+' :
                result = i+j;
                System.out.println(result);
                break;
            case '-' :
                result = i-j;
                System.out.println(result);
                break;
            case '*' :
                result = i*j;
                System.out.println(result);
                //break;
            case '/' :
                result = i/j;
                System.out.println(result);
                break;
        }
    }
}
