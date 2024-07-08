package StringsDSA;

public class MinimumIndex {

    static int nonRep(String str) {
        int count[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1 ) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String str = "abbcda";

        System.out.println(nonRep(str));
    }
}
