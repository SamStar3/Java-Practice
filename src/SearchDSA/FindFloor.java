package SearchDSA;

public class FindFloor {
    static int findFloor(long arr[], int n, long x) {
        int left = 0;
        int right = n - 1;
        int result = -1;

        // Implementing binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If the mid element is less than or equal to x
            if (arr[mid] <= x) {
                result = mid; // Update result and move to the right half
                left = mid + 1;
            } else {
                right = mid - 1; // Move to the left half
            }
        }

        return result;
    }

    public static void main(String[] args) {
        long[] arr1 = {1, 2, 8, 10, 11, 12, 19};
        long x1 = 0;
        System.out.println(findFloor(arr1, arr1.length, x1));

        long[] arr2 = {1, 2, 8, 10, 11, 12, 19};
        long x2 = 5;
        System.out.println(findFloor(arr2, arr2.length, x2));
    }
}
