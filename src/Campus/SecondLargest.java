package Campus;

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {3,2,5,7,7,5};
//        int[] ar = arr..
        int secondL = Integer.MIN_VALUE;
        int FirstL = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > FirstL){
                secondL = FirstL;
                FirstL = arr[i];
            }else if(arr[i] > secondL && arr[i] != FirstL) {
                secondL = arr[i];
            }
        }
        if (secondL == Integer.MIN_VALUE){
            System.out.println(FirstL);
        }

        System.out.println(secondL);
    }
}
