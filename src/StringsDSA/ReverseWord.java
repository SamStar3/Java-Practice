package StringsDSA;

import java.util.Arrays;

public class ReverseWord {

    static void reverse(char str[], int start, int end)
    {
        char temp;

        while (start <= end) {
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
    static char[] reverseWords(char[] s)
    {

        int start = 0;
        for (int end = 0; end < s.length; end++) {

            if (s[end] == ' ') {
                reverse(s, start, end);
                start = end + 1;
            }
        }
//        char[] da =

        // Reverse the last word
        reverse(s, start, s.length - 1);

        // Reverse the entire String
        reverse(s, 0, s.length - 1);
        return s;
    }

    public static void main(String[] args)
    {
        String s = "i like this program very much ";

        char[] p = reverseWords(s.toCharArray());
        System.out.print(p);
    }
}
