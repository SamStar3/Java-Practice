package PracticeW;

import java.util.Scanner;

public class Array {

    public static int minStepsToOne(int n) {

        int[] dp = new int[n + 1];

        dp[1] = 0;

        for (int i = 2; i <= n; i++) {

            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the input integer n
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Output the minimum steps to reduce n to 1
        System.out.println("Minimum steps to reduce " + n + " to 1 : " + minStepsToOne(n));

        // Close the scanner
        scanner.close();
    }
}
