package SortingDSA;

import java.util.Arrays;

public class CycleSort {

//    public static void main(String[] args) {
//
//        int[] arr = {20,30,10,50,40};
//        int n = arr.length;
//
//        for (int cs = 0; cs < n - 1; cs++){
//            int item = arr[cs];
//            int pos = cs;
//
//            for (int i = cs + 1;i < n;i++){
//                if (arr[i] < item){
//                    pos++;
//                }
//                if (pos == cs) {
//                    continue;
//                }
//                while (item == arr[pos]) {
//                    pos += 1;
//                }
//                if (pos != cs) {
//                    int temp = arr[i];
//                    arr[i] = item;
//                    item = temp;
//                }
//
//                while (pos != cs) {
//                    pos = cs;
//                    for (int j = cs + 1;j < n; j++) {
//                        if (arr[j] < item) {
//                            pos++;
//                        }
//                        while (item == arr[pos]) {
//                            pos += 1;
//                        }
//                        if (item != arr[pos]) {
//                            int temp1 = arr[j];
//                            arr[j] = item;
//                            item = temp1;
//
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }

    public static void cycleSort(int arr[], int n)
    {
        // count number of memory writes
        int writes = 0;

        // traverse array elements and put it to on
        // the right place
        for (int cycle_start = 0; cycle_start <= n - 2; cycle_start++) {
            // initialize item as starting point
            int item = arr[cycle_start];

            // Find position where we put the item. We basically
            // count all smaller elements on right side of item.
            int pos = cycle_start;
            for (int i = cycle_start + 1; i < n; i++)
                if (arr[i] < item)
                    pos++;

            // If item is already in correct position
            if (pos == cycle_start)
                continue;

            // ignore all duplicate elements
            while (item == arr[pos])
                pos += 1;

            // put the item to it's right position
            if (pos != cycle_start) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
                writes++;
            }

            // Rotate rest of the cycle
            while (pos != cycle_start) {
                pos = cycle_start;

                // Find position where we put the element
                for (int i = cycle_start + 1; i < n; i++)
                    if (arr[i] < item)
                        pos += 1;

                // ignore all duplicate elements
                while (item == arr[pos])
                    pos += 1;

                // put the item to it's right position
                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                    writes++;
                }
            }
        }
    }

    // Driver program to test above function
    public static void main(String[] args)
    {
        int arr[] = { 1, 8, 3, 9, 10, 10, 2, 4 };
        int n = arr.length;
        cycleSort(arr, n);

        System.out.println("After sort : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
