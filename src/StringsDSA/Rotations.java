package StringsDSA;

public class Rotations {

    static boolean areRotation(String s1, String s2) {
//
//        if (s1.length() != s2.length()){
//            return false;
//        }
//        return ((s1+s2).indexOf(s2) >= 0);

        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.length() < 2) {
            return s1.equals(s2);
        }

        int n = s1.length();

        String clockRotation = s1.substring(n -2) + s1.substring(0, n - 2);

        String antiClockRotation = s1.substring(2) + s1.substring(0,2);

        return s2.equals(clockRotation) || s2.equals(antiClockRotation);
    }

    public static void main(String[] args) {

        String s1 = "amazon";
        String s2 = "azonam";

        System.out.println(areRotation(s1,s2));
    }
}
