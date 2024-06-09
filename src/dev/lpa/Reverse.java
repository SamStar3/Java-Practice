package dev.lpa;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args){

        int[] arr = {2,4,5,7,8,9};
        int n = arr.length;
//        int[] arr1 = new int[n];
//        int j = n -1;
//
//        for (int i = 0; i < n;i++){
//            arr1[j--] = arr[i];
//        }
//
//        System.out.println(Arrays.toString(arr1));
        int i = 0;
        int j = n -1;

        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));


    }
}
