package StringsDSA;

public class FindSum {

    public static long findSum(String str) {
        long sum = 0;
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                // If the character is a digit, append it to the current number
                num.append(ch);
            } else {
                // If the character is not a digit, check if we have a number to add to the sum
                if (num.length() > 0) {
                    sum += Long.parseLong(num.toString());
                    num.setLength(0); // Reset the number
                }
            }
        }

        // Add the last number if the string ended with digits
        if (num.length() > 0) {
            sum += Long.parseLong(num.toString());
        }

        return sum;
    }

    // For testing purposes
    public static void main(String[] args) {
        String str1 = "1abc23";
        System.out.println(findSum(str1)); // Output: 24

        String str2 = "geeks4geeks";
        System.out.println(findSum(str2)); // Output: 4
    }
}
