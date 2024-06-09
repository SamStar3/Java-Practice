package SortingDSA;

import java.util.Arrays;

public class KthSmallest {

    public static void main (String[] args){

        int [] array = {3,5,7,2,1,8};
        int k = 3;
        int n = array.length;

        Arrays.sort(array);

        System.out.println(array[k - 1]);
    }
}
