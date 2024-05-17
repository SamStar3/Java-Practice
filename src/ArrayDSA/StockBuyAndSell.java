package ArrayDSA;

import java.util.ArrayList;

public class StockBuyAndSell {
    ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (n == 1) {
            return result;
        }

        int i = 0;
        while (i < n - 1) {
            // Find Local Minima
            while ((i < n - 1) && (A[i + 1] <= A[i])) {
                i++;
            }

            if (i == n - 1) {
                break;
            }

            int buy = i++;
            // Find Local Maxima
            while ((i < n) && (A[i] >= A[i - 1])) {
                i++;
            }

            int sell = i - 1;
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(buy);
            pair.add(sell);
            result.add(pair);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] prices1 = {100, 180, 260, 310, 40, 535, 695};
        int n1 = prices1.length;
        StockBuyAndSell sol = new StockBuyAndSell();
        ArrayList<ArrayList<Integer>> result1 = sol.stockBuySell(prices1, n1);
        for (ArrayList<Integer> pair : result1) {
            System.out.println("Buy on day " + pair.get(0) + " and sell on day " + pair.get(1));
        }

        int[] prices2 = {4, 2, 2, 2, 4};
        int n2 = prices2.length;
        ArrayList<ArrayList<Integer>> result2 = sol.stockBuySell(prices2, n2);
        for (ArrayList<Integer> pair : result2) {
            System.out.println("Buy on day " + pair.get(0) + " and sell on day " + pair.get(1));
        }
    }
}
