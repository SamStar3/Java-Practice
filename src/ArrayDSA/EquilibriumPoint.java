package ArrayDSA;

public class EquilibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {
        if (n == 1) {
            return 1; // Only one element, so it is the equilibrium point
        }

        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i]; // Calculate total sum of array
        }

        long leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i]; // Update total sum by excluding current element
            if (leftSum == totalSum) {
                return i + 1; // Return 1-based index of equilibrium point
            }
            leftSum += arr[i]; // Update left sum
        }

        return -1; // No equilibrium point found
    }

    public static void main(String[] args) {
        int n1 = 5;
        long[] arr1 = {1, 3, 5, 2, 2};
        System.out.println("Equilibrium Point for Array 1: " + equilibriumPoint(arr1, n1));

        int n2 = 1;
        long[] arr2 = {1};
        System.out.println("Equilibrium Point for Array 2: " + equilibriumPoint(arr2, n2));
    }
}
