package Interview;

public class SecondLargest {

    public static void main(String[] args){

        int arr[] = {5,5,5,5};

        if (arr.length == 0 || arr.length == 1){
            System.out.println(-1);

        }

        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for (int i : arr){

            if (max < i){
                sec = max;
                max = i;
            }
            else if (sec < i  && i!= max){
                sec = i;
            }
        }

        if (sec == Integer.MIN_VALUE){
            System.out.println(max);
        }else {
            System.out.println(sec);

        }
    }
}
