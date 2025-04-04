package HackerRank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class NumbersAverage {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        try {
            // Read from Numbers.txt
            File file = new File("Numbers.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt()); // Read integers into the list
            }
            scanner.close();

            // Convert List to Array
            int[] numArray = numbers.stream().mapToInt(i -> i).toArray();

            // Calculate Average
            double sum = 0;
            for (int num : numArray) {
                sum += num;
            }
            double average = sum / numArray.length;

            // Print the Average
            System.out.println("Numbers: " + numbers);
            System.out.println("Average: " + average);

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Make sure 'Numbers.txt' exists.");
        }
    }
}
