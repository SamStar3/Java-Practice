package Interview;

public class MissingNumber {

    public static void main(String[] args){

        int arr[] = {1,2,3,4,5,6,8,9};
        int sum = 0;
        int totel = 0;

        for (int i =0; i < arr.length; i++){
            sum = sum+ arr[i];
        }
        System.out.println(sum);
        for (int i = arr[0]; i <= arr[arr.length-1]; i ++){
            totel =  totel + i;
        }
        System.out.println(totel);
        System.out.println(totel - sum);

    }
}
