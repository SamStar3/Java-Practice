package Campus;

public class Average {

    public static void main(String[] args) {

        int arr[] = {1,5,11};

        double sum = 0;

        for (int i = 0; i < arr.length; i++ ){
            sum += arr[i];
        }

        sum = sum / arr.length;

        System.out.println(sum);
    }
}
