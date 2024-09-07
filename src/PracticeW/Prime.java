package PracticeW;

import java.util.Scanner;

public class Prime {

    public static int countDigits(int n){

        int count = 0;

         if (n == 0){
             return 1;
         }
         while (n != 0) {
             n = n/10;
             count++;

         }
         return count;
    }
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the input integer n
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Output the number of digits using mathematical approach
        System.out.println("Number of digits in " + n + " is: " + countDigits(n));

        // Close the scanner
        scanner.close();
    }
}
