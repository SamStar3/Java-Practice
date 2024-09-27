package Campus;

import java.util.Arrays;

public class BigThree {

    public static void main(String[] args) {

        int[] arr = {2,9,4,6,7,8};

        Arrays.sort(arr);

        for (int i = arr.length-3; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
