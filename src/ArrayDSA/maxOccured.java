package ArrayDSA;

public class maxOccured {
    public static int maxOccured(int L[], int R[], int n, int maxx) {
        int[] arr = new int[1000000];
        for (int i = 0; i < n; i++) {
            arr[L[i]] += 1;
            arr[R[i] + 1] -= 1;
        }

        int maxPrefixSum = arr[0], res = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
            if (maxPrefixSum < arr[i]) {
                maxPrefixSum = arr[i];
                res = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] L = {1, 4, 3, 1};
        int[] R = {15, 8, 5, 4};
        int n = 4;
        int maxx = 15;
        System.out.println(maxOccured(L, R, n, maxx));
    }
}
