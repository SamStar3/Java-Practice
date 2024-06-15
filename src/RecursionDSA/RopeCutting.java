package RecursionDSA;

public class RopeCutting {

    static int maxPieces(int n, int a, int b,int c) {
        if (n == 0){
            return 0;
        }
        if (n <= -1) {
            return -1;
        }
        int res = Math.max(maxPieces(n - a, a,b,c),
        Math.max(maxPieces(n - b, a, b, c), maxPieces(n - c, a, b , c)));

        if (res == -1 ) {
            return -1;
        }
        return res+1;

    }

    public static void main(String[] args) {
        int n = 23;
        int a = 12;
        int b = 9;
        int c = 11;
        System.out.println(maxPieces(n,a,b,c));
    }
}
