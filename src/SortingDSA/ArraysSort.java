package SortingDSA;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {

    public static void main(String[] args)
    {
        // Our arr contains 8 elements
        int[] arr1 = {5, 20, 12, 30};
        char[] arr2 = {'B', 'B', 'A', 'C', 'A'};

        // Sorting the first array
        Arrays.sort(arr1);

        // Displaying the first array
        System.out.println(Arrays.toString(arr1));

        // Sorting the second array
        Arrays.sort(arr2);

        // Displaying the second array
        System.out.println(Arrays.toString(arr2));

        int[] arr = {33, 30, 20, 10, 8};

        // Sort subarray from index 1 to 3, i.e.,
        // only sort subarray {30, 20, 10} and
        // keep other elements as it is.
        Arrays.sort(arr, 1, 4);

        System.out.println(Arrays.toString(arr));

        Integer[] arr5 = {5, 20, 10, 12};

        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Arrays.sort(arr5, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr5));
    }


}
