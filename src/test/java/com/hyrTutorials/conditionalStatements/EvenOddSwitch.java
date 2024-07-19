package com.hyrTutorials.conditionalStatements;

import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch(i%2){
            case 0:
                System.out.println("Even number");
                break;
            case 1:
                System.out.println("odd number");
                break;
        }
    }
}
