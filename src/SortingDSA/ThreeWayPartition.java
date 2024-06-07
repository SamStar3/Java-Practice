package SortingDSA;

public class ThreeWayPartition {

    public void threeWayPartition(int array[], int a, int b) {
        int n = array.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (array[mid] < a) {
                // Swap array[low] and array[mid]
                int temp = array[low];
                array[low] = array[mid];
                array[mid] = temp;
                low++;
                mid++;
            } else if (a <= array[mid] && array[mid] <= b) {
                mid++;
            } else {
                // Swap array[mid] and array[high]
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        // Example 1
        int n = 5;
        int array[] = {1, 2, 3, 3, 4};
        int a = 1, b = 2;
        ThreeWayPartition obj = new ThreeWayPartition();
        obj.threeWayPartition(array, a, b);
        System.out.println("1");

    }
}
