package com.xworkz.interviewpratice;

import java.util.Scanner;

public class SumOfNumInString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with numbers in it: ");
        String input = scanner.nextLine();
        scanner.close(); // Closing scanner to prevent resource leak

        int sum = findSum(input);
        System.out.println("Sum of numbers in the string: " + sum);
    }

    public static int findSum(String str) {
        int total = 0;
        int currentNumber = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0'); // Building the number
            } else {
                total += currentNumber; // Add previous number to total
                currentNumber = 0; // Reset for the next number
            }
        }
        total += currentNumber; // Adding last number (if any)
        return total;
    }
}
