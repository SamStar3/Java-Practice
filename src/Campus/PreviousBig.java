package Campus;

public class PreviousBig {

    public static void main(String[] args) {

        int[] arr = {7,5,8,2,9};

        int count = 0;
        for (int i =1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
