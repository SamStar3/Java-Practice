package SearchDSA;

public class Count1s {
    static int countOnes(int arr[], int n)
    {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1) {
                if (mid == n - 1 || arr[mid + 1] == 0) {
                    return mid + 1;
                } else {

                    low = mid + 1;
                }
            } else {

                high = mid - 1;
            }
        }


        return 0;
    }

    public static void main(String args[])
    {
        int N1 = 8;
        int[] arr1 = {1, 1, 1, 1, 1, 0, 0, 0};
        System.out.println(countOnes(arr1, N1));

        int N2 = 8;
        int[] arr2 = {1, 1, 0, 0, 0, 0, 0, 0};
        System.out.println(countOnes(arr2, N2));
    }

}

