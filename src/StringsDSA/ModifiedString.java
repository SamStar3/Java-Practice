package StringsDSA;

public class ModifiedString {

    static int modified(String str) {
        int n = str.length();
        if (n < 3 ) {
            return 0;
        }
        int insert = 0;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
                if (count == 3) {
                    insert++;
                    count = 1;
                }
            }else {
                count = 1;
            }
        }
        return insert;
    }

    public static void main(String[] args ) {

        String str = "aabbbcc";

        System.out.println(modified(str));
    }
}
