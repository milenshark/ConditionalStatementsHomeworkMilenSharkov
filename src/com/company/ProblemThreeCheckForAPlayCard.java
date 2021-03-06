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

        if (playCardSign == "2" || playCardSign == "3" || playCardSign == "4" || playCardSign == "5"
                || playCardSign == "6" || playCardSign == "7" || playCardSign == "8" || playCardSign == "9"
                || playCardSign == "10" || playCardSign == "J" || playCardSign == "Q"
                || playCardSign == "K" || playCardSign == "A")
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

    }
}
