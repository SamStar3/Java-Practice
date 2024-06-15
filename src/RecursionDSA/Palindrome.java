package RecursionDSA;

public class Palindrome {

    static boolean isPalindrome(String n,int i) {

        if (i > n.length()/2){
            return true;
        }
        return n.charAt(i) == n.charAt(n.length()-i - 1) && isPalindrome(n, i+1);
    }

    public static void main(String[] args) {
        String n = "sam";
        int i = 0;
        if(isPalindrome(n,i)){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
    }
}
