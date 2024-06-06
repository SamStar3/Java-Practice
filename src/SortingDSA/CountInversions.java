package SortingDSA;

public class CountInversions {
    public static void main (String[] args){
        int[] arr = {5,4,2,1};

        int res = 0;
//        int j = 0;
        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
            for (int j = i+1;j < n; j++) {
                if(arr[i] > arr[j]) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
