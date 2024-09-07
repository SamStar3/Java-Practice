package PracticeW;

import java.util.Scanner;

public class Array {

    public static int minStepsToOne(int n) {

    }
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the input integer n
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Output the minimum steps to reduce n to 1
        System.out.println("Minimum steps to reduce " + n + " to 1: " + minStepsToOne(n));

        // Close the scanner
        scanner.close();
    }
}
