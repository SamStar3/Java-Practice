package StringsDSA;

public class BinaryString {

    static void binarySub(String s, int n ) {

//        int count = 0;
//        for (int i = 0; i < s.length();i++) {
//            for (int j = i+1; j < s.length(); j++) {
//                if (s.charAt(i) == '1' && s.charAt(j) == '1') {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }

        int result = (count * (count - 1)) / 2;
        System.out.println(result);
    }
    public static void main(String[] args) {

        String s = "1111";
        int n = s.length();

        binarySub(s,n);
    }
}
