package Campus;

public class RecursionPrimeFactor {

    static void primeFactor(int n)
    {
       if(n==1)
       {
           return;
       }
       int i=2;
       while (n%i != 0)
       {
           i = i+1;
       }
       System.out.print(STR."\{i} ");
       primeFactor(n/i);

    }
    public static void main(String[] arg)
    {
       primeFactor(100);
    }
}
