package SortingDSA;

public class UnionOfTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {2,4,5,5,6,7,9};
        int[] arr2 = {2,3,8};

        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;

        while(i < n1 && j < n2){
            if(i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if(j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }
            if(arr1[i] < arr2[j]) {
                System.out.println(arr1[i]);
                i++;
            }else if (arr1[i] > arr2[j]) {
                System.out.println(arr2[j]);
                j++;
            }
            else  {
                System.out.println(arr2[i]);
                i++;
                j++;
            }

//            System.out.println(arr2[j]);
        }
        while (i < n1) {
            if(i > 0 && arr1[i] != arr1[i-1]) {
                System.out.println(arr1[i]);
                i++;
            }
        }
        while(j < n2) {
            if (j > 0 && arr2[j] != arr2[j-1]) {
                System.out.println(arr2[j]);
                j++;
            }
        }
    }
}
