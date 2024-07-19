package com.hyrTutorials.conditionalStatements;

import java.util.Scanner;

public class Day {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Day = sc.nextLine();
        if(Day.equals("Monday") || Day.equals("Tuesday")||Day.equals("Wednesday")||Day.equals("Thursday")||Day .equals("Friday")){
            System.out.println("Uff, it's a weekday.");
        }
        if(Day.equals("Saturday" )|| Day.equals("Sunday")){
            System.out.println("Yaay,It's a weekend");
        }
        else{
            System.out.println("It's invalid day");
        }
    }
}
