package HashingDSA;

public class NumContaining {

    static void distWind(int[] arr, int k, int n) {

        for (int i = 0; i <= n - k; i++) {
            int count = 0;
            for (int j = 0; j < k; j++){
                boolean flag = false;
                for (int p = 0; p < j; p++) {
                    if (arr[i + j] == arr[i +p]) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static void main(String[] args) {

        int[] arr = {10,10,5,3,20,5};
        int k = 4;
        int n = arr.length;

        distWind(arr, k, n);
    }
}
