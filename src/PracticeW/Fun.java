package PracticeW;

import java.util.Scanner;

public class Fun {

    public static int sumOfEvenNumbers(int n){
        int Total = 0;

        for (int i = 0; i <= n; i += 2) {
            Total += i;
        }
        return Total;
    }
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the input integer n
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Output the result
        System.out.println("Sum of all even numbers from 1 to " + n + " is: " + sumOfEvenNumbers(n));

        // Close the scanner
        scanner.close();
    }
}
