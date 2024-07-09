package StringsDSA;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfNum {

    public static int primeDigits(int n) {
        // Array of prime digits
        int[] primeDigits = {2, 3, 5, 7};

        // Queue for BFS
        Queue<String> queue = new LinkedList<>();

        // Enqueue initial prime digits as strings
        for (int digit : primeDigits) {
            queue.add(String.valueOf(digit));
        }

        // Variable to store the nth prime-digit number
        String nthPrimeDigitNumber = "";

        // BFS until we find the nth number
        for (int i = 0; i < n; i++) {
            nthPrimeDigitNumber = queue.poll();

            // Generate the next sequence of numbers
            for (int digit : primeDigits) {
                queue.add(nthPrimeDigitNumber + digit);
            }
        }

        // Convert the resulting string to an integer and return
        return Integer.parseInt(nthPrimeDigitNumber);
    }

    // For testing purposes
    public static void main(String[] args) {
        System.out.println(primeDigits(10)); // Output: 33
        System.out.println(primeDigits(21)); // Output: 222
    }
}
