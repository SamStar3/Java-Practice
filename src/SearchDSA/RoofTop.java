package SearchDSA;

public class RoofTop {
    static int maxStep(int A[], int N) {
        // Initialize the maximum step count and current step count
        int maxSteps = 0;
        int currentSteps = 0;

        // Iterate through the array from the second element
        for (int i = 1; i < N; i++) {
            // If the current building is higher than the previous one
            if (A[i] > A[i - 1]) {
                // Increment the current step count
                currentSteps++;
                // Update the maximum step count if current step count is greater
                maxSteps = Math.max(maxSteps, currentSteps);
            } else {
                // Reset the current step count if current building is not higher
                currentSteps = 0;
            }
        }

        return maxSteps;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {1, 2, 2, 3, 2};
        int n1 = arr1.length;
        System.out.println(maxStep(arr1, n1));

        // Test case 2
        int[] arr2 = {1, 2, 3, 4};
        int n2 = arr2.length;
        System.out.println(maxStep(arr2, n2));


    }
}
