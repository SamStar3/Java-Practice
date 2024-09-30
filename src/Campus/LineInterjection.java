package Campus;

public class LineInterjection {

    public static int nextValue(int n, int[] sequence) {
        if (n < 2) {
            return 999;  // Not enough elements to determine a pattern
        }

        // Check for Arithmetic Progression (AP)
        int diff = sequence[1] - sequence[0];
        boolean isAP = true;
        for (int i = 2; i < n; i++) {
            if (sequence[i] - sequence[i - 1] != diff) {
                isAP = false;
                break;
            }
        }
        if (isAP) {
            return sequence[n - 1] + diff;
        }

        // Check for Geometric Progression (GP)
        if (sequence[0] != 0) {
            double ratio = (double) sequence[1] / sequence[0];
            boolean isGP = true;
            for (int i = 2; i < n; i++) {
                if (sequence[i - 1] == 0 || (double) sequence[i] / sequence[i - 1] != ratio) {
                    isGP = false;
                    break;
                }
            }
            if (isGP) {
                return (int) (sequence[n - 1] * ratio);
            }
        }

        // Check for Fibonacci-like sequence
        boolean isFibonacci = true;
        for (int i = 2; i < n; i++) {
            if (sequence[i] != sequence[i - 1] + sequence[i - 2]) {
                isFibonacci = false;
                break;
            }
        }
        if (isFibonacci) {
            return sequence[n - 1] + sequence[n - 2];
        }

        return 999;  // No known pattern found
    }
    public static void main(String[] arg)
    {
        int[] sequence = {3, 9, 27};
        int n = sequence.length;
        System.out.println(nextValue(n, sequence));

    }
}
