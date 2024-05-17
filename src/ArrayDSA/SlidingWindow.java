package ArrayDSA;

import java.util.*;
import java.io.*;
import java.lang.*;

public class SlidingWindow {

    static int maxSum(int arr[], int n, int k)
    {
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i + k - 1 < n; i++)
        {
            int sum = 0;

            for(int j = 0; j < k; j++)
            {
                sum += arr[i + j];
            }

            max_sum = Math.max(max_sum, sum);
        }

        return max_sum;

    }
    public static void main(String args[])
    {
        int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;

        System.out.println(maxSum(arr, n, k));

    }

}
