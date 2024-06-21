package HashingDSA;

import java.util.HashMap;

public class CheckEqualArrays {

    public static boolean check(long A[], long B[], int N) {
        // Create hash maps to store the frequencies of elements in both arrays.
        HashMap<Long, Integer> frequencyA = new HashMap<>();
        HashMap<Long, Integer> frequencyB = new HashMap<>();

        // Populate frequency map for array A.
        for (int i = 0; i < N; i++) {
            frequencyA.put(A[i], frequencyA.getOrDefault(A[i], 0) + 1);
        }

        // Populate frequency map for array B.
        for (int i = 0; i < N; i++) {
            frequencyB.put(B[i], frequencyB.getOrDefault(B[i], 0) + 1);
        }

        // Compare both frequency maps.
        return frequencyA.equals(frequencyB);
    }

    public static void main(String[] args) {
        int N = 5;
        long A[] = {1, 2, 5, 4, 0};
        long B[] = {2, 4, 5, 0, 1};

        boolean result = check(A, B, N);
        System.out.println(result ? 1 : 0); // Expected output: 1

        N = 3;
        long C[] = {1, 2, 5};
        long D[] = {2, 4, 15};

        result = check(C, D, N);
        System.out.println(result ? 1 : 0); // Expected output: 0
    }
}
