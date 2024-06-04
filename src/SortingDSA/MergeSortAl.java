package SortingDSA;

import java.util.Arrays;

public class MergeSortAl {
    public static void main(String[] args) {

        int arr1[] = {1,3,7,9};
        int arr2[] = {2,5,8};

        int n = arr1.length;
        int m = arr2.length;

        int i = n - 1;
        int j = 0;

        while(i >= 0 && j < m)
        {
            if(arr1[i] > arr2[j])
            {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int a : arr1){
            System.out.print(" " + a);
        }
        System.out.println();
        for(int a :arr2){
            System.out.print(" " + a);
        }
    }
}
