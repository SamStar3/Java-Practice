package BinarySearchTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class SmallerRight {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim()); // Number of test cases
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim()); // Number of elements
            int[] arr = Arrays.stream(br.readLine().trim().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            sb.append(getMaxDistinctSmallerCount(arr, N)).append("\n");
        }
        System.out.print(sb);
    }

    private static int getMaxDistinctSmallerCount(int[] arr, int N) {
        TreeSet<Integer> set = new TreeSet<>();
        int maxCount = 0;

        for (int i = N - 1; i >= 0; i--) {
            maxCount = Math.max(maxCount, set.headSet(arr[i], false).size());
            set.add(arr[i]); // Insert the current element into the set
        }
        return maxCount;
    }

}
