package SortingDSA;

import java.util.Arrays;

public class FindTriplets {

    public boolean findTriplets(int arr[], int n) {
        // Sorting the array
        Arrays.sort(arr);

        // Iterating through the array
        for (int i = 0; i < n - 2; i++) {
            // Using two pointers to find the other two elements
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    return true;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        // If no triplet with zero sum found
        return false;
    }

    public static void main(String[] args) {
        FindTriplets solution = new FindTriplets();

        int[] arr1 = {0, -1, 2, -3, 1};
        int n1 = arr1.length;
        System.out.println(solution.findTriplets(arr1, n1));  // Output: true (1)

        int[] arr2 = {1, 2, 3};
        int n2 = arr2.length;
        System.out.println(solution.findTriplets(arr2, n2));  // Output: false (0)
    }

}
