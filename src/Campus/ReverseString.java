package Campus;

public class ReverseString {

    public static void main(String[] args) {


        String input = "Hello World";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            String capitalizedWord = reversedWord.substring(0, 1).toUpperCase() + reversedWord.substring(1).toLowerCase();
            result.append(capitalizedWord).append(" ");
        }

        System.out.println(input);
        System.out.println(result.toString().trim());



       /* for (int i = 0; i < str.length(); i++ ) {
            if (str.charAt(i) == ' ' || i == str.length() - 1) {
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(str.charAt(j));
                    i--;
                }
            }
        }*/
    }
}
