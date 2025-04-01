package Interview;

import java.util.Scanner;

public class SentenceProcessor {


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a sentence with at least 10 words:");
//        String sentence = scanner.nextLine();
//        scanner.close();
//
//        String[] words = sentence.split("\\s+");
//
//        if (words.length < 10) {
//            System.out.println("Please enter at least 10 words.");
//            return;
//        }
//
//        System.out.println("\nNumber of consonants in each word:");
//        for (String word : words) {
//            int consonantCount = 0;
//
//            for (char ch : word.toCharArray()) {
//                if (Character.isLetter(ch) && !"AEIOUaeiou".contains(String.valueOf(ch))) {
//                    consonantCount++;
//                }
//            }
//            System.out.println(word + " -> " + consonantCount + " consonants");
//        }
//
//        System.out.println("\nWords with the first letter capitalized:");
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            if (!word.isEmpty()) {
//                words[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1);
//            }
//        }
//
//        System.out.println(String.join(" ", words));
//    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        sc.close();

        String[] words = str.split(" ");

//        System.out.println(words.toString());

        if (words.length < 10){
            System.out.println("you want to enter 10 sentence");
        }

        for (String word : words){

            int count = 0;
            for (char ch : word.toCharArray()){
                if (Character.isLetter(ch) && !"AEIOUaeiou".contains(String.valueOf(ch))){
                    count++;
                }
            }

            System.out.println(word + "  " + count);
        }
    }
}
