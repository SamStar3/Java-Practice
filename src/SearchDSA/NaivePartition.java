package SearchDSA;

public class NaivePartition {
    public static void main(String[] args0) {
        int[] arr = {5,13,6,9,11,8};
        int p = 5;
        int l = 0;
        int h = arr.length;

        int[] temp = new int[h];
        int index = 0;

        for(int i = 0; i < h; i++){
            if (arr[i] <= arr[p]){
                temp[index++] = arr[i];
            }
        }
        for (int i = 0; i < h; i++){
            if (arr[i] > arr[p]){
                temp[index++] = arr[i];
            }
        }
        for (int i = 0; i < h; i++){
            arr[i] = temp[i];
        }

        for (int a : arr) {
            System.out.print(a);
        }
    }
}
