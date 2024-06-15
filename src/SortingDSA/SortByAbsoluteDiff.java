package SortingDSA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByAbsoluteDiff {
    // Function to sort the array according to the absolute difference with given number.
    static void sortABS(List<Integer> arr, int n, int k)
    {
        // Custom comparator to sort based on the absolute difference with K
        Collections.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                // Compute absolute differences
                int diff1 = Math.abs(a - k);
                int diff2 = Math.abs(b - k);

                // If differences are the same, maintain original order
                if (diff1 == diff2) {
                    return 0;
                }

                // Otherwise, sort based on the absolute difference
                return diff1 - diff2;
            }
        });
    }

    // Driver code to test the function
    public static void main(String[] args) {
        // Test case 1
        List<Integer> arr1 = Arrays.asList(10, 5, 3, 9, 2);
        sortABS(arr1, arr1.size(), 7);
        System.out.println(arr1); // Expected output: [5, 9, 10, 3, 2]

        // Test case 2
        List<Integer> arr2 = Arrays.asList(1, 2, 3, 4, 5);
        sortABS(arr2, arr2.size(), 6);
        System.out.println(arr2); // Expected output: [5, 4, 3, 2, 1]
    }
}
