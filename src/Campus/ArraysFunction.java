package Campus;

import java.util.Arrays;

public class ArraysFunction {

    public static void main(String[] args) {

        int arr1[] = {18,3,4,5,13,2};
        int arr2[] = {18,5,13,2};
        int i = 13;

        System.out.println(Arrays.compare(arr1,arr2));

        System.out.println(Arrays.binarySearch(arr1,i));
    }
}
