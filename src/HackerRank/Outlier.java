package HackerRank;

import java.util.Arrays;
import java.util.List;

public class Outlier {

    public static int getOutlierValue(List<Integer> arr) {
        int totalSum = 0;

        // Calculate the total sum of the array
        for (int num : arr) {
            totalSum += num;
        }

        int outlier = Integer.MIN_VALUE;

        // Check each element to find the outlier
        for (int num : arr) {
            int sumWithoutNum = totalSum - num;

            // If sumWithoutNum is equal to one of the elements (not equal to num)
            if (!arr.contains(sumWithoutNum) || sumWithoutNum == num) {
                outlier = Math.max(outlier, num);
            }
        }

        return outlier;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(9, 2, 8, 1, 5);
        int outlier = Outlier.getOutlierValue(arr);
        System.out.println("Outlier: " + outlier);  // Expected Output: 9
    }

}
