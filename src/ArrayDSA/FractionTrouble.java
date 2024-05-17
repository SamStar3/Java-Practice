package ArrayDSA;

public class FractionTrouble {
    public int[] largestFraction(int n, int d) {
        int maxN = 0, maxD = 1;
        for (int i = 1; i <= 10000; i++) {
            int numer = n * i / d;
            if (n * i % d == 0) {
                numer--;
            }
            if (numer * maxD > maxN * i) {
                maxN = numer;
                maxD = i;
            }
        }
        return new int[]{maxN, maxD};
    }

    public static void main(String[] args) {
        int n = 1, d = 8;
        FractionTrouble solution = new FractionTrouble();
        int[] result = solution.largestFraction(n, d);
        System.out.println(result[0] + " " + result[1]);
    }

}
