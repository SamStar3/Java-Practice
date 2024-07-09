package StringsDSA;

import java.util.HashSet;

public class ConcatenatedString {

    public static String concatenatedString(String s1, String s2) {
        // Creating sets to store characters of both strings
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        // Adding characters of s1 to set1
        for (char ch : s1.toCharArray()) {
            set1.add(ch);
        }

        // Adding characters of s2 to set2
        for (char ch : s2.toCharArray()) {
            set2.add(ch);
        }

        // Finding common characters
        HashSet<Character> common = new HashSet<>(set1);
        common.retainAll(set2);

        // Building the result string
        StringBuilder result = new StringBuilder();

        // Adding uncommon characters from s1
        for (char ch : s1.toCharArray()) {
            if (!common.contains(ch)) {
                result.append(ch);
            }
        }

        // Adding uncommon characters from s2
        for (char ch : s2.toCharArray()) {
            if (!common.contains(ch)) {
                result.append(ch);
            }
        }

        // If no characters left, return -1
        if (result.length() == 0) {
            return "-1";
        }

        return result.toString();
    }

    // For testing purposes
    public static void main(String[] args) {
        String s1 = "aacdb";
        String s2 = "gafd";
        System.out.println(concatenatedString(s1, s2)); // Output: cbgf

        s1 = "abcs";
        s2 = "cxzca";
        System.out.println(concatenatedString(s1, s2)); // Output: bsxz
    }
}
