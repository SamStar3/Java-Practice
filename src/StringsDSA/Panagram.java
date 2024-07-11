package StringsDSA;

import java.util.HashSet;

public class Panagram {

    public static boolean checkPangram(String s) {
        HashSet<Character> letters = new HashSet<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Convert to lowercase and add to the set
                letters.add(Character.toLowerCase(c));
            }
        }

        // Check if the set contains all 26 letters
        return letters.size() == 26;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(checkPangram("Bawds jog, flick quartz, vex nymph")); // Output: true
        System.out.println(checkPangram("sdfs")); // Output: false
    }
}
