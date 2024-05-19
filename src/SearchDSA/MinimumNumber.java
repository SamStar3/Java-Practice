package SearchDSA;

public class MinimumNumber {
    static int minNumber(int arr[], int low, int high) {
        // Base case: if the array is not rotated at all
        if (high < low) {
            return arr[0];
        }

        // If there is only one element left
        if (high == low) {
            return arr[low];
        }

        // Find the middle element
        int mid = low + (high - low) / 2;

        // Check if mid+1 is the minimum element
        if (mid < high && arr[mid + 1] < arr[mid]) {
            return arr[mid + 1];
        }

        // Check if mid itself is the minimum element
        if (mid > low && arr[mid] < arr[mid - 1]) {
            return arr[mid];
        }

        // Decide whether we need to go to the left half or the right half
        if (arr[high] > arr[mid]) {
            return minNumber(arr, low, mid - 1);
        } else {
            return minNumber(arr, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr1[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        int n1 = arr1.length;
        System.out.println(minNumber(arr1, 0, n1 - 1));

        int arr2[] = {3, 4, 5, 1, 2};
        int n2 = arr2.length;
        System.out.println(minNumber(arr2, 0, n2 - 1));
    }
}
