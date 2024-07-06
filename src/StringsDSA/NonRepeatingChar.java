package StringsDSA;

public class NonRepeatingChar {

    static char nonrepeat(String S) {

        int[] charCount = new int[256];

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            charCount[ch]++;
        }
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (charCount[ch] == 1) {
                return ch;
            }
        }
        return '$';
    }

    public static void main(String[] args) {

        String S = "zxvczbtxyzvy";

        System.out.println(nonrepeat(S));
    }
}
