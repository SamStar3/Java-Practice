package ArrayDSA;

public class BettingGame {
    static int betBalance(String result) {
        int sum = 4;
        int bet = 1;

        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            if (sum < bet) {
                return -1;
            }
            if (c == 'W') {
                sum += bet;
                bet = 1;
            } else {
                sum -= bet;
                bet *= 2;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Output: " + betBalance("WL"));
        System.out.println("Output: " + betBalance("WLWLLLWWLW"));
    }
}
