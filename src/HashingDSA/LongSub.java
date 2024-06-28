package HashingDSA;

public class LongSub {

    static int longSub(int[] arr, int n ) {

        int res = 0;

        for (int i = 0; i < n;  i++) {
            int c0 = 0;
            int c1 = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 0) {
                    c0++;
                }else {
                    c1++;
                }
                if (c0 == c1) {
                    res = Math.max(res, c0 + c1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,1,0,1,0};
        int n = arr.length;

        System.out.println(longSub(arr, n));
    }
}
