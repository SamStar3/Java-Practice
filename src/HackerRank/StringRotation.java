package HackerRank;

public class StringRotation {

    static String rotation(String s, String r, int n){

        int len = s.length();
        n %= len;
        if (r.equalsIgnoreCase("L-ROTATION")){
            return s.substring(n) + s.substring(0,n);
        }else {
            return s.substring(len - n) + s.substring(0, len - n);
        }
    }

//    static String leftRotation(String s, int n){
//
//        int len = s.length();
//        n %= len;
//
//        return s.substring(n) + s.substring(0,n);
//    }
//
//    static String rightRotation(String s, int n){
//
//        int len = s.length();
//        n%= len;
//
//        return s.substring(len - n) + s.substring(0, len - n);
//    }

    public static void main(String[] args){

        String s = "ZOHOCORPORATION";
        String r = "L-ROTATION";
        int n = 4;

        System.out.println(rotation(s,r,n));

//        String result;
//
//        if (r.equalsIgnoreCase("L-ROTATION")){
//            result = leftRotation(s,n);
//        }else if (r.equalsIgnoreCase("R-ROTATION")){
//            result = rightRotation(s,n);
//        }else {
//            System.out.println("Invalid Rotation type");
//            return;
//        }
//
//        System.out.println("Rotated String: " + result);
    }
}
