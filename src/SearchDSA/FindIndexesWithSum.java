package SearchDSA;

import java.util.ArrayList;

public class FindIndexesWithSum {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int start = 0;
        int last = 0;
        boolean flag = false;
        int currsum = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();

        //iterating over the array.
        for (int i = 0; i < n; i++) {
            //storing sum upto current element.
            currsum += arr[i];

            //checking if current sum is greater than or equal to given number.
            if (currsum >= s) {
                last = i;
                //we start from starting index till current index and do the
                //excluding part while s(given number) < currsum.
                while (s < currsum && start < last) {
                    //subtracting the element from left i.e., arr[start]
                    currsum -= arr[start];
                    ++start;
                }

                //now if current sum becomes equal to given number, we store
                //the starting and ending index for the subarray.
                if (currsum == s) {
                    res.add(start + 1);
                    res.add(last + 1);

                    //flag is set to true since subarray exists.
                    flag = true;
                    break;
                }
            }
        }
        //if no subarray is found, we store -1 in result else the found indexes.
        if (flag == false) {
            res.add(-1);
        }
        //returning the result.
        return res;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {1, 2, 3, 7, 5};
        int n = 5;
        int s = 12;
        System.out.println(subarraySum(arr1, n, s));

        // Test case 2
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n2 = 10;
        int s2 = 15;
        System.out.println(subarraySum(arr2, n2, s2));
    }
}
