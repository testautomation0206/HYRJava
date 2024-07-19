package com.hyrTutorials.conditionalStatements;

import java.util.Scanner;

public class DaySwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day :");
        String Day = sc.nextLine();
        switch(Day){
            case "Monday":
                System.out.println("uff,it's weekday");
                break;
            case "Tuesday":
                System.out.println("uff,it's weekday");
                break;
            case "Wednesday":
                System.out.println("uff,it's weekday");
                break;
            case "Thursday" :
                System.out.println("uff,it's weekday");
                break;
            case "Friday" :
                System.out.println("uff,it's weekday");
                break;
            case "Saturday":
                System.out.println("Yaay,it's weekend");
                break;
            case "Sunday":
                System.out.println("Yaay,it's weekend");
                break;

            default:
                System.err.println("This is Invalid input");
                break;
    }

    }
}
