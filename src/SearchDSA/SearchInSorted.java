package SearchDSA;

public class SearchInSorted {
    static int searchInSorted(int arr[], int N, int K) {
        int left = 0;
        int right = N - 1;

        // Implementing binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if K is present at mid
            if (arr[mid] == K) {
                return 1; // Element is found
            }

            // If K is greater, ignore the left half
            if (arr[mid] < K) {
                left = mid + 1;
            }
            // If K is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // If we reach here, then the element was not present
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 6};
        int k1 = 6;
        System.out.println(searchInSorted(arr1, arr1.length, k1)); // Output: 1

        int[] arr2 = {1, 3, 4, 5, 6};
        int k2 = 2;
        System.out.println(searchInSorted(arr2, arr2.length, k2)); // Output: -1
    }
}
