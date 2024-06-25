package HashingDSA;

import java.util.ArrayList;
import java.util.HashSet;

public class PosNegPair {

    static void pair(int arr[], int sum) {

        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            int res = sum - i;
            if(set.contains(res)) {
                System.out.println(true);
            }else {
                set.add(i);
            }
        }
        System.out.println(false);

    }

    public static void main(String[] args) {

        int[] arr = {8,3,9,4};
        int sum = 13;

        pair(arr,sum);
    }
}
