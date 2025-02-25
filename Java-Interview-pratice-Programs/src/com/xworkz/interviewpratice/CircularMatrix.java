package com.xworkz.interviewpratice;
import java.util.Scanner;


public class CircularMatrix {



        public static void printSpiral(int[][] matrix, int rows, int cols) {
            int top = 0, bottom = rows - 1;
            int left = 0, right = cols - 1;

            while (top <= bottom && left <= right) {
                // Move left to right
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] + " ");
                }
                top++; // Move boundary down

                // Move top to bottom
                for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " ");
                }
                right--; // Move boundary left

                // Move right to left (if row remains)
                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        System.out.print(matrix[bottom][i] + " ");
                    }
                    bottom--; // Move boundary up
                }

                // Move bottom to top (if column remains)
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(matrix[i][left] + " ");
                    }
                    left++; // Move boundary right
                }
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input matrix dimensions
            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = scanner.nextInt();

            int[][] matrix = new int[rows][cols];

            // Input matrix elements
            System.out.println("Enter the matrix elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Print spiral order
            System.out.println("Spiral Order:");
            printSpiral(matrix, rows, cols);

            scanner.close();
        }
    }


