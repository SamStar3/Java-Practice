package Campus;

public class Hour {

    public static void main(String[] args) {

        int arr[] = {1, 30, 59, 45, 30, 7, 11};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == 60) {
                    System.out.println("ONe Hour "+  i + " and" + j );
                }
            }
        }
    }
}
