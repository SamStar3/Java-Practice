package SortingDSA;

import dev.lpa.Array;

public class LomutoPartition {

    public static void main (String[] args) {

        int[] arr = {7,7,4,2,5};
        int p = 4;
        int l = 0;
        int h = arr.length;

        int index = l -1;

        for(int i = l;i < h; i++){
            if(arr[i] < arr[p]){
                index++;
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        int temp =0;
        temp = arr[p];
        arr[p] = arr[++index];
        arr[index] = temp;

        for(int i : arr){
            System.out.print(i);
        }
    }
}
