package HackerRank;

public class StringRotation {

//    static String rotation(String s, String r, int n){
//
////        char[] chars = s.toCharArray();
//        StringBuilder sb = new StringBuilder;
//        char rotation = r.charAt(0);
//        if (rotation == 'L'){
//            for (int i = n - 1; i < s.length() - 1; i++){
//                sb.append(s.charAt(i));
//            }
//        }
//        String str = sb.toString();
//        return str;
//    }

    static String leftRotation(String s, int n){

        int len = s.length();
        n %= len;

        return s.substring(n) + s.substring(0,n);
    }

    static String rightRotation(String s, int n){

        int len = s.length();
        n%= len;

        return s.substring(len - n) + s.substring(0, len - n);
    }

    public static void main(String[] args){

        String s = "ZOHOCORPORATION";
        String r = "L-ROTATION";
        int n = 4;

//        System.out.println(rotation(s,r,n));

        String result;

        if (r.equalsIgnoreCase("L-ROTATION")){
            result = leftRotation(s,n);
        }else if (r.equalsIgnoreCase("R-ROTATION")){
            result = rightRotation(s,n);
        }else {
            System.out.println("Invalid Rotation type");
            return;
        }

        System.out.println("Rotated String: " + result);
    }
}
