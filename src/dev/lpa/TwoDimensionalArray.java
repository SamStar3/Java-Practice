package dev.lpa;

import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        System.out.println(" Arr leangth is " + arr.length);



//        System.out.println(Arrays.toString(arr));
//
//        for(int[] a : arr) {
////            System.out.println(a);
//            System.out.println(Arrays.toString(a));
//        }
//
        for (int i = 0; i < arr.length; i++) {
            var innerArray = arr[i];
            for (int j = 0; j < innerArray.length; j++) {
//                System.out.print(arr[i][j] + " ");
                arr[i][j] = (i * 10) + (j + 1);
            }

//            System.out.println();
        }
//        for (var outer : arr) {
//            for (var element : outer) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }

        System.out.println(Arrays.deepToString(arr));
    }
}
