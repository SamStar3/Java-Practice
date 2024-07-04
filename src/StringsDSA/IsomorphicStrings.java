package StringsDSA;

import java.util.HashMap;

public class IsomorphicStrings {

    public static boolean areIsomorphic(String str1, String str2) {
        // If lengths are not equal, they cannot be isomorphic
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create two hash maps to store character mappings
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        // Iterate through characters of both strings
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            // Check if there is a mapping already
            if (map1.containsKey(c1)) {
                // If c1 is already mapped to a different character, return false
                if (map1.get(c1) != c2) {
                    return false;
                }
            } else {
                // Map c1 to c2
                map1.put(c1, c2);
            }

            // Check the reverse mapping
            if (map2.containsKey(c2)) {
                // If c2 is already mapped to a different character, return false
                if (map2.get(c2) != c1) {
                    return false;
                }
            } else {
                // Map c2 to c1
                map2.put(c2, c1);
            }
        }

        // If all characters can be mapped correctly, return true
        return true;
    }

    public static void main(String[] args) {

        System.out.println(areIsomorphic("aab", "xxy"));
        System.out.println(areIsomorphic("aab", "xyz"));
    }
}
