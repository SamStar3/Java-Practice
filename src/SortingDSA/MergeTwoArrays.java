package SortingDSA;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,3,7,9};
        int arr2[] = {2,5,8};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int arr3[] = new int[n1 + n2];

        int i =0,j =0,k =0;

        while (i < n1 && j < n2) {
            if(arr1[i] < arr2[j]){
                arr3[k++] = arr1[i++];
            }else {
                arr3[k++] = arr2[j++];
            }

        }
        while (i < n1) {
            arr3[k++] = arr1[i++];
        }
        while (j < n2) {
            arr3[k++] = arr2[j++];
        }
        int n3 = arr3.length;
        int q = 0;
//        for(int z =0; z< n1; z++){
//            arr1[z] = arr3[z];
//            q++;
//        }
//        int s = n3 - n2 ;
//        for(int w = 0;w<s;w++){
//            arr2[w] = arr3[n1++];
//        }
        while (q < n1){
            arr1[q++] = arr3[q++];
        }

        int x = 0;
        while(q < n3) {
            arr2[x++] = arr3[j++];
        }

        for (int a : arr3){
            System.out.print(" " +a);
        }
        for(int a : arr1){
            System.out.print(a);
        }
        for(int a : arr2){
            System.out.print(a);
        }
    }
}
