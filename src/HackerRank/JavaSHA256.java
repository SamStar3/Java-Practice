package HackerRank;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        try {
            // Get an instance of SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Compute the hash
            byte[] hashBytes = md.digest(input.getBytes());

            // Convert bytes to hexadecimal string
            StringBuilder hexHash = new StringBuilder();
            for (byte b : hashBytes) {
                hexHash.append(String.format("%02x", b));
            }

            // Print the SHA-256 hash
            System.out.println(hexHash.toString());

        } catch (NoSuchAlgorithmException e) {
            System.err.println("SHA-256 Algorithm not found!");
        }
    }
}
