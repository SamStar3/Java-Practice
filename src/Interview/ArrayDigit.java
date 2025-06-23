package Interview;

public class ArrayDigit {

    public static void main(String[] args){

        int arr[] = {8,2,1,1,9};

        int count[] = new int[10];
        for (int i : arr){
            count[i]++;
        }

        StringBuilder str = new StringBuilder();

        for (int i = 9; i >=0 ; i--){

            while (count[i]> 0){
                str.append(i);
                count[i]--;
            }
        }

        System.out.println(str);
    }
}
