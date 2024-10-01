package Campus;

public class Chef {

    public static void main(String[] args) {

//        int[] arr1 = {2,20};
//        int[] arr2 = {15, 67};
//        int[] arr3 = {10, 90};
//        int res = 0;
//
//        for (int i = 0; i < arr2.length; i++) {
//            if(arr1[1] <= arr2[i]){
//                res += arr3[i];
//            }
//        }
//        System.out.println(res);


        int[][] arr = {
                {2, 20},
                {15, 67},
                {10,90}
        };
        int res = 0;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[1][i] >= arr[0][1]){
                res += arr[2][i];
            }
        }
        System.out.println(res);
        
    }
}
