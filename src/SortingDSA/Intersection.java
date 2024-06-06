package SortingDSA;

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 5, 9 ,9};
        int[] arr2 = {5, 5, 9, 10};
//        ArrayList list = new ArrayList();

        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                i++;
            }else
            if (arr1[i] > arr2[j]) {
                j++;
            }else
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }

    }
}
