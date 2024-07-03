package StringsDSA;

public class Test {

    public static void main(String[] args) {

        String s1 = "sam";
        String s2 = "sam";

        if (s1 == s2) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        String s3 = new String("sam");
        if (s1 == s3) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        //s1.contains()...
        //s1.equals()...
        //s1.compareTo()...
        //indexOf()...
    }
}
