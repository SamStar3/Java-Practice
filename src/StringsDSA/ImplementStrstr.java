package StringsDSA;

public class ImplementStrstr {

    static int strstr(String s, String x){

        if (x.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= s.length() - x.length(); i++) {
            int j;
            for (j = 0; j < x.length(); j++) {
                if (s.charAt(i + j) != x.charAt(j)) {
                    break;
                }
            }
            if (j == x.length()) {
                return i;
            }
        }

        // If no match was found, return -1
        return -1;
    }

    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        String x = "Fr";

        System.out.println(strstr(s,x));
    }
}
