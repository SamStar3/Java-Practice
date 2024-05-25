package SearchDSA;

public class TwoRepeatedElements {
    public int[] twoRepeated(int arr[], int n) {
        // Initialize the result array to store the two repeated numbers.
        int[] result = new int[2];
        int index = 0;

        // Iterate over the array to find the repeated elements.
        for (int i = 0; i < n + 2; i++) {
            // Calculate the absolute value of the current element.
            int absValue = Math.abs(arr[i]);

            // If the value at index corresponding to the absolute value of arr[i] is negative,
            // it means the element arr[i] has been seen before.
            if (arr[absValue] < 0) {
                result[index++] = absValue;
            } else {
                // Otherwise, mark the element by making it negative.
                arr[absValue] = -arr[absValue];
            }
        }

        // Return the array containing the two repeated elements.
        return result;
    }
    public static void main(String[] args) {
        TwoRepeatedElements solution = new TwoRepeatedElements();

        // Example 1
        int[] arr1 = {1, 2, 1, 3, 4, 3};
        int n1 = 4;
        int[] result1 = solution.twoRepeated(arr1, n1);
        System.out.println(result1[0] + " " + result1[1]); // Output: 1 3

        // Example 2
        int[] arr2 = {1, 2, 2, 1};
        int n2 = 2;
        int[] result2 = solution.twoRepeated(arr2, n2);
        System.out.println(result2[0] + " " + result2[1]); // Output: 2 1
    }
}
