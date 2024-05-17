package SearchDSA;

public class SearchanElement {
    static int search(int arr[], int N, int X) {

        for (int i = 0; i < N; i++) {
            if (arr[i] == X) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int x1 = 3;
        int result1 = search(arr1, arr1.length, x1);
        System.out.println(result1);

    }
}
