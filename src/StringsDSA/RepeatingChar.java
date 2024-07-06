package StringsDSA;

public class RepeatingChar {

//    static final int CHAR = 35;
    static int repeat(String str) {


//        int[] index = new int[CHAR];

        for (int i = 0; i < str.length(); i++ ) {
            for (int j = i + 1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    return i;
                }
            }
        }
        return  -1;

    }

    public static void main(String[] args) {

        String str = "samjohnraja";

        System.out.println(repeat(str));
    }
}
