package HackerRank;

public class RemoveVowels {

//    static String vowels(String str){

//        String result = "";
//        for (int i = 0; i < str.length(); i++){
//            if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'o'){
//                result = str.substring(0,i) + str.substring(i - 1, str.length());
//            }
//        }
//        return result;


//    }

    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static String removeVowels(String str) {
        StringBuilder result = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char current = str.charAt(i);

            if (i > 0 && isVowel(current) && isVowel(str.charAt(i - 1))) {
                continue;
            }

            if (!isVowel(current) ||
                    (i > 0 && !isVowel(str.charAt(i - 1))) ||
                    (i == 0 || i == len - 1)) {
                result.append(current);
            }
        }

        return result.toString();
    }


    public static void main(String[] args){

        String str = "Camputer";

        System.out.println(vowels(str));
    }
}
