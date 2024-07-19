package com.hyrTutorialsEnglish;

import java.util.Scanner;

public class Text {
    public static void main(String[] args){

        Double result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        Double i =  sc.nextDouble();
        System.out.println("Enter first number:");
        Double j = sc.nextDouble();
        System.out.println("Choose an charecter:+,-,*,/,%");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+':
                result = i+j;
                System.out.println("Addition of 2 numbers is"+result);
            case '-':
                result = i+j;
                System.out.println("Addition of 2 numbers is"+result);
        }

    }
}
