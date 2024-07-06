package StringsDSA;

public class MaxOccuringChar {

    static char getMaxOcc(String line) {

        int[] freq = new int[26];

        for (int i = 0; i < line.length();i++) {
            char ch = line.charAt(i);
            freq[ch - 'a']++;
        }
        int maxFreq = 0;
        char maxChar = 'a';

        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar =(char) (i + 'a');
            }else if (freq[i] == maxFreq) {
                char currentChar = (char) (i + 'a');
                if (currentChar < maxChar) {
                    maxChar = currentChar;
                }
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {

        String line = "output";

        System.out.println(getMaxOcc(line));
    }
}
