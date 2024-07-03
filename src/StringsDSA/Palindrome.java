package StringsDSA;

public class Palindrome {

    static void palindrome(String str) {
//        StringBuilder rev = new StringBuilder(str);
//
//        rev.reverse();
//        return str.equals(rev.toString());

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println("It's not Palindrome");
            }
            start++;
            end--;
        }
        System.out.println("It's Palindrome");
    }

    public static void main(String[] args) {

        String str = "ABcvBA";
        palindrome(str);
    }
}
