/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        String s1 = x.nextLine();
        Integer num1 = null;
        try {
            num1 = Integer.valueOf(s1);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integers please.");
            System.exit(0);
        }
        String month;
        switch(num1){
            case 1: month="The name of the month is January.";
                    break;
            case 2: month="The name of the month is February.";
                    break;
            case 3: month="The name of the month is March.";
                    break;
            case 4: month="The name of the month is April.";
                    break;
            case 5: month="The name of the month is May.";
                    break;
            case 6: month="The name of the month is June.";
                    break;
            case 7: month="The name of the month is July.";
                    break;
            case 8: month="The name of the month is August.";
                    break;
            case 9: month="The name of the month is September.";
                    break;
            case 10: month="The name of the month is October.";
                    break;
            case 11: month="The name of the month is November.";
                    break;
            case 12: month="The name of the month is December.";
                    break;
            default: month="Invalid entry";
                    break;
        }

        System.out.println(month);

        System.exit(0);
    }
}