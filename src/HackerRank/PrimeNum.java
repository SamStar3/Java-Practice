package HackerRank;

import java.util.Scanner;

public class PrimeNum {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the total number of integers: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        System.out.print("Enter the integers separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");

        // Displaying prime numbers
        System.out.print("Prime Numbers: ");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(input[i]);
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
