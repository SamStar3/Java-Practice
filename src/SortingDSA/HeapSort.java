package SortingDSA;


import javax.swing.plaf.PanelUI;
import java.util.Arrays;

public class HeapSort {

    public static void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest]= temp;
//            swap(arr[i], arr[largest]);

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Main function for heap sort
    public static void heapSort(int arr[], int n)
    {
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
//            swap(arr[0], arr[i]);

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        int n = arr.length;
        heapSort(arr,n);

        System.out.println(Arrays.toString(arr));
    }
}
