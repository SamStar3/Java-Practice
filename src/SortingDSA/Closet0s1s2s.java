package SortingDSA;

import java.util.Arrays;

public class Closet0s1s2s {

    public static void main(String[] args) {

        int[] arr = {0,1,1,2,0,1};
        int n = arr.length;

//        int[] temp = new int[n];
//        int i = 0;
//
//        for(int j = 0; j < n; j++) {
//            if(arr[j] == 0) {
//                temp[i++] = arr[j];
//            }
//        }
//        for(int j = 0;j < n; j++) {
//            if(arr[j] == 1) {
//                temp[i++] = arr[j];
//            }
//        }
//        for(int j = 0; j < n; j++) {
//            if (arr[j] == 2){
//                temp[i++] = arr[j];
//            }
//        }
//
//        System.out.println(Arrays.toString(temp));

        int lo = 0;
        int hi = n - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[hi];
                    arr[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
