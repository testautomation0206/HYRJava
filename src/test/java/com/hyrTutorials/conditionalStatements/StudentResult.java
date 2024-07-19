package com.hyrTutorials.conditionalStatements;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        if(result<35){
            System.out.println("fail");
        }
        else if(result==35){
            System.out.println("Pass");
        }
        else if(result>=35&&result<=70){
            System.out.println("Third class");
        }
        else if(result>=70&&result<=85){
            System.out.println("Second class");
        }
        else if(result>85){
            System.out.println("First class");
        }
    }
}
