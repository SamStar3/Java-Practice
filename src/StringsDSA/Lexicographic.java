package StringsDSA;

public class Lexicographic {

    static final int CHAR = 256;
    static int lexRank(String str) {
        int res = 1;
        int n = str.length();
        int mul = 1000000007;
        int count[] = new int[CHAR];

        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 1; i < CHAR; i++) {
            count[i] += count[i - 1];
        }
        for (int i = 0; i < n -1; i++) {
            mul = mul /(n - 1);
            res = res + count[str.charAt(i) -1] * mul;
            for (int j = str.charAt(i); j < CHAR;j++) {
                count[j]--;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        String str = "STRING";

        System.out.println(lexRank(str));
    }
}
