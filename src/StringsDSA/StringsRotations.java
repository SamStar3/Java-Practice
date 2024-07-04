package StringsDSA;

public class StringsRotations {

    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String concatenated = s1 + s1;
//        System.out.println(concatenated);
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {

        System.out.println(areRotations("geeksforgeeks", "forgeeksgeeks"));
//        areRotations("geeksforgeeks", "forgeeksgeeks");
    }

}
