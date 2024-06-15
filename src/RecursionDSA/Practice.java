package RecursionDSA;

public class Practice {
    static void fun(int n){
        if (n == 0) {
            return;
        }
        fun(n / 2);
        System.out.println(n % 2);
    }

    public static void main(String[] main) {
        fun(16);
    }
}
