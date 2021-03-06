package com.company;

import java.util.Scanner;

public class ProblemOneExchangeIfGreater {

    public static void main(String[] args) {

//        Problem 1. Exchange If Greater
//        Write an if-statement that takes two double variables a and b and exchanges their values
//        if the first one is greater than the second one. As a result print the values a and b, separated by a space.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a = ");
        String variableA = scanner.next();
        double a = Double.parseDouble(variableA);
        System.out.print("Please enter b = ");
        String variableB = scanner.next();
        double b = Double.parseDouble(variableB);


        System.out.println(a + " " + b);

    }
}
