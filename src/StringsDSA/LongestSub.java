package StringsDSA;

public class LongestSub {

    static boolean areDistinet(String str, int i, int j) {
        boolean visited[] = new boolean[256];

        for (int k = i; k <= i; k++){
            if (visited[str.charAt(k)] == true) {
                return false;
            }
            visited[str.charAt(k)] =true;
        }
        return true;
    }
    static int longestDistinet(String str) {

        int n = str.length();
        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (areDistinet(str,i,j)) {
                    res = Math.max(res, j - i +1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        String str = "abac";

        System.out.println(longestDistinet(str));
    }
}
