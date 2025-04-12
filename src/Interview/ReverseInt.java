package Interview;

public class ReverseInt {

    public static void main(String[] args){

        int num = 435324;

        int rev = 0;

        while(num != 0){
            rev = rev * 10 + num % 10;
            num/=10;
        }

        System.out.println(rev);
//
//        StringBuffer str =new StringBuffer(String.valueOf(rev));

        System.out.println(new StringBuffer(String.valueOf(rev)).reverse());
    }
}
