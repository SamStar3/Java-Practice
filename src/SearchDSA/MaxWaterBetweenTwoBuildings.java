package SearchDSA;

public class MaxWaterBetweenTwoBuildings {
    static int maxWater(int height[], int n) {
        // If there are less than 2 buildings, no water can be trapped
        if (n < 2) return 0;

        // Initialize two pointers
        int left = 0;
        int right = n - 1;

        // Variable to store the maximum water trapped
        int max_water = 0;

        // Traverse the array using two pointers
        while (left < right) {
            // Calculate the height of the shorter building
            int current_water = Math.min(height[left], height[right]) * (right - left - 1);

            // Update max_water if the current calculated water is greater
            max_water = Math.max(max_water, current_water);

            // Move the pointer pointing to the shorter building
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max_water;
    }
    public static void main(String[] args) {
        int[] height1 = {2, 1, 3, 4, 6, 5};
        int n1 = height1.length;
        System.out.println(maxWater(height1, n1)); // Output: 8

        int[] height2 = {2, 1};
        int n2 = height2.length;
        System.out.println(maxWater(height2, n2)); // Output: 0

        int[] height3 = {3, 1, 2, 4, 5};
        int n3 = height3.length;
        System.out.println(maxWater(height3, n3)); // Output: 8

        int[] height4 = {1, 1, 1, 1, 1};
        int n4 = height4.length;
        System.out.println(maxWater(height4, n4)); // Output: 3
    }
}
