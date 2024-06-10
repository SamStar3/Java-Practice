package SortingDSA;

import java.util.Arrays;

public class MeetingMax {

    public static void main (String[] args) {

//        int[][] arr = {{5,10},{3,15},{18,30},{2,7}};

        int [] arr1 = {800,700,600,500};
        int [] arr2 = {840,820,830,530};
        int n = arr1.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 1;
        int j = 0;
        int cur = 1;
        int res = 1;

        while (i < n && j < n) {
            if (arr2[j] >= arr1[i]) {
                cur++;i++;
            }
            else {
                cur--; j++;
            }
            res = Math.max(res,cur);
        }
        System.out.println(res);

//        Arrays.sort(arr,arr+n,0);
    }
}
