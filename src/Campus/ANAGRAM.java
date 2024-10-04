package Campus;
import java.util.*;
public class ANAGRAM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        n = n.toLowerCase();
        String k= sc.nextLine();
        k = k.toLowerCase();

        int l1 = n.length();
        int l2 = k.length();

        if(l1!=l2){
            System.out.println("not a anagram");
        }
        else{
            char arr[] = n.toCharArray();
            Arrays.sort(arr);
        }

    }
}
