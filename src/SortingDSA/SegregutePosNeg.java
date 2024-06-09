package SortingDSA;

import java.util.Arrays;

public class SegregutePosNeg {

    public static void main(String[] args) {

        int[] arr = {13, -12, 18, -10};
        int n = arr.length;

//        int temp[] = new int[n];
//        int i = 0;
//
//        for (int j = 0; j < n; j++) {
//            if (arr[j] < 0) {
//                temp[i++] = arr[j];
//            }
//        }
//        for (int j = 0; j < n; j++) {
//            if (arr[j] > 0) {
//                temp[i++] = arr[j];
//            }
//        }
//        for(int j = 0; j < n;j++){
//            arr[j] = temp[j];
//        }
//
//        System.out.println(Arrays.toString(arr));

        int i = -1;
        int j = n;
        while (true) {
            do{
                i++;
            }while (arr[i] < 0);
            do {
                j--;
            }while (arr[j] >= 0);
            if(i >= j) {
                System.out.println(Arrays.toString(arr));
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}
