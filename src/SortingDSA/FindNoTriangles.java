package SortingDSA;

import java.util.Arrays;
public class FindNoTriangles {
    public static void main(String[] args){

        int[] arr = {6, 4, 9, 7, 8};
        int n = arr.length;

        Arrays.sort(arr);

        int count = 0;

        // Iterate through the array from the end to the third element
        for (int i = n - 1; i >= 2; i--)
        {
            int left = 0;
            int right = i - 1;

            // Use two pointers to find valid pairs
            while (left < right)
            {
                // Check if the sum of the elements at left and right pointers
                // is greater than the current element (arr[i])
                if (arr[left] + arr[right] > arr[i])
                {
                    // If true, all elements between left and right can form a triangle
                    // with the current element
                    count += (right - left);

                    // Move the right pointer to the left
                    right--;
                }
                else
                {
                    // If false, move the left pointer to the right
                    left++;
                }
            }
        }

        System.out.println(count);

    }
}
