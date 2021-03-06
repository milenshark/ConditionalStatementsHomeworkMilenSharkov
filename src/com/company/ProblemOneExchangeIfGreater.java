package com.company;

import java.util.Scanner;

public class ProblemOneExchangeIfGreater {

    public static void main(String[] args) {

//        Problem 1. Exchange If Greater
//        Write an if-statement that takes two double variables a and b and exchanges their values
//        if the first one is greater than the second one. As a result print the values a and b, separated by a space.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a = ");
        String aString = scanner.nextLine();

        System.out.print("Please enter b = ");
        String bString = scanner.nextLine();

        double a = Double.parseDouble(aString);
        double b = Double.parseDouble(bString);

        if (a > b) {
            System.out.println(bString + " " + aString);
        } else {
            System.out.println(aString + " " + bString);
        }
    }
}
