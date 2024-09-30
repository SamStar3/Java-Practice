package Campus;

public class Dish {

    public static void main(String[] args){

        int[] arr = {-1, 2, 3};
        int sum = 0;

        for (int i = 0; i < arr.length; i++ ){
            if (arr[i] > 0) {
                sum +=   arr[i] * (i + 1);
            }
        }

        System.out.println(sum);
    }
}
