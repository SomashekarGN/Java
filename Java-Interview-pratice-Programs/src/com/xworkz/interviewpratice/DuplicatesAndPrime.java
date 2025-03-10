package com.xworkz.interviewpratice;
import java.util.*;


public class DuplicatesAndPrime {

        public static void main(String[] args) {
            int[] array = {11, 7, 15, 11, 21, 7, 18, 17};

            // Finding duplicates
            Set<Integer> uniqueNumbers = new HashSet<>();
            Set<Integer> duplicates = new HashSet<>();
            for (int num : array) {
                if (!uniqueNumbers.add(num)) {
                    duplicates.add(num);
                }
            }

            System.out.println("Duplicates: " + duplicates);

            // Separating primes and non-primes
            List<Integer> primes = new ArrayList<>();
            List<Integer> nonPrimes = new ArrayList<>();
            for (int num : array) {
                if (isPrime(num)) {
                    primes.add(num);
                } else {
                    nonPrimes.add(num);
                }
            }

            // Printing primes first and non-primes next
            System.out.println("Prime Numbers: " + primes);
            System.out.println("Non-Prime Numbers: " + nonPrimes);
        }

        // Helper method to check if a number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


