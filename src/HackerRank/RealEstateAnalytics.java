package HackerRank;

public class RealEstateAnalytics {

    public static int findMinimumVariance(int[] height) {
        int n = height.length;
        int minVariance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if the first and last element of the segment are the same
                if (height[i] == height[j]) {
                    int segmentSize = j - i + 1;
                    int occurrences = 0;

                    // Count occurrences of the first element in this segment
                    for (int k = i; k <= j; k++) {
                        if (height[k] == height[i]) {
                            occurrences++;
                        }
                    }

                    // Calculate variance
                    int variance = segmentSize - occurrences;
                    minVariance = Math.min(minVariance, variance);
                }
            }
        }

        return minVariance;
    }

    public static void main(String[] args) {
        int[] height = {3, 6, 4, 6, 3, 3};
        System.out.println("Minimum Variance: " + findMinimumVariance(height));
    }
}
