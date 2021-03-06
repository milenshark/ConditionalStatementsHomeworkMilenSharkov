package com.company;

import java.util.Scanner;

public class ProblemThreeCheckForAPlayCard {

    public static void main(String[] args) {

//        Problem 3. Check for a Play Card
//        Classical play cards use the following signs to designate the card face: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q,
//        K and A. Write a program that enters a string and prints “yes” if it is a valid card sign or “no” otherwise.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a play card sign: ");
        String playCardSign = scanner.next();


        switch (playCardSign) {
            case "2":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            case "J":
            case "Q":
            case "K":
            case "A":
                System.out.println("yes");
                break;
            default:
                System.out.println("no");
        }
    }
}
