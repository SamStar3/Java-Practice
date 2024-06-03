package SortingDSA;

public class SelectionSort {
    public static void main(String[] args){
        int arr[] = {4,6,7,2,5};
        int n = arr.length;

        for(int i = 0; i < n -1; i++) {
            int min = i;
            for(int j = i+1; j < n;j++) {
                if(arr[j] < arr[i]) {
                    min = j;
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int a : arr){
            System.out.print(a);
        }
    }
}
