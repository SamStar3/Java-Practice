package Campus;

import java.util.Arrays;

public class SubSequence {

    public static void main(String[] args) {

//        int arr[] = {1,9,3,10,4,20,2};
        int arr[] = {36,41,56,35,44,33,34,43,32,42};

        Arrays.sort(arr);
        int count = 1;
System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length ; i++ ){
                if (arr[i] == (arr[i-1] +1)) {
                    count++;
                }else {
                    break;
                }
        }
        System.out.println(count);
    }
}
