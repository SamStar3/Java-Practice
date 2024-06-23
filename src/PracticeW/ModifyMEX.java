package PracticeW;

import java.util.HashSet;
import java.util.Set;

public class ModifyMEX {

     static int modifyMEX(int n, int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }


        int mex = 0;
        while (set.contains(mex)) {
            mex++;
        }


        if (mex == 0) {
            return -1;

        }


        int[] count = new int[mex + 1];
        for (int num : arr) {
            if (num <= mex) {
                count[num]++;
            }
        }


        int minRemovals = Integer.MAX_VALUE;
        for (int i = 0; i < mex; i++) {
            minRemovals = Math.min(minRemovals, count[i]);
        }

        return minRemovals;


    }

    public static void main (String[] args){

        int arr[] = {0, 1, 2, 2, 3, 5};
        int n = 6;

        System.out.println(modifyMEX(n,arr));

    }
}
