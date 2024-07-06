package StringsDSA;

public class Isogram {

    static boolean isIsogram(String data) {

        boolean[] seen = new boolean[26];

        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            int index = ch - 'a';

            if (seen[index]) {
                return false;
            }
            seen[index] = true;
        }

        return true;
    }
    public static void main(String[] args) {

        String data = "machine";

        System.out.println(isIsogram(data));
    }
}
