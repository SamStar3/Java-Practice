package SortingDSA;

import java.util.ArrayList;

public class Merge3Sorted {
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        // Traverse all arrays until one of them gets exhausted
        while (i < A.length && j < B.length && k < C.length) {
            if (A[i] <= B[j] && A[i] <= C[k]) {
                result.add(A[i]);
                i++;
            } else if (B[j] <= A[i] && B[j] <= C[k]) {
                result.add(B[j]);
                j++;
            } else {
                result.add(C[k]);
                k++;
            }
        }

        // Traverse remaining elements of A and B
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                result.add(A[i]);
                i++;
            } else {
                result.add(B[j]);
                j++;
            }
        }

        // Traverse remaining elements of B and C
        while (j < B.length && k < C.length) {
            if (B[j] <= C[k]) {
                result.add(B[j]);
                j++;
            } else {
                result.add(C[k]);
                k++;
            }
        }

        // Traverse remaining elements of A and C
        while (i < A.length && k < C.length) {
            if (A[i] <= C[k]) {
                result.add(A[i]);
                i++;
            } else {
                result.add(C[k]);
                k++;
            }
        }

        // Add remaining elements of A, B, and C if any
        while (i < A.length) {
            result.add(A[i]);
            i++;
        }

        while (j < B.length) {
            result.add(B[j]);
            j++;
        }

        while (k < C.length) {
            result.add(C[k]);
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[] B = {1, 2, 3, 4, 5};
        int[] C = {1, 2, 3, 4, 5, 6};

        ArrayList<Integer> merged = merge3sorted(A, B, C);

        for (int num : merged) {
            System.out.print(num + " ");
        }
        // Output should be: 1 1 1 2 2 2 3 3 3 4 4 4 5 5 6
    }
}
