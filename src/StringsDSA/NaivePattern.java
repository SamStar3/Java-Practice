package StringsDSA;

public class NaivePattern {

    static void patSearch(String txt, String pat) {

        int n = txt.length();
        int m = pat.length();

        for (int i =0; i <= n - m;  ) {
            int j;
            for (j = 0; j < m; j++) {
                if (pat.charAt(j) != txt.charAt(i + j)){
                    break;
                }
            }
            if (j == m) {
                System.out.print(i + " ");
            }
            if (j == 0){
                i++;
            }else {
                i = (i + j);
            }
        }
    }

    public static void main(String[] args) {

        String txt = "ABCEABEFABCD";
        String pat = "ABCD";

        patSearch(txt,pat);
    }
}
