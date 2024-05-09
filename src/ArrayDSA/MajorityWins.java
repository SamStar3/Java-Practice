package ArrayDSA;

public class MajorityWins {
    public int majorityWins(int arr[], int n, int x, int y) {
        int countX = 0, countY = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                countX++;
            else if (arr[i] == y)
                countY++;
        }

        if (countX > countY || (countX == countY && x < y))
            return x;
        else
            return y;
    }

    public static void main(String[] args) {
        MajorityWins solution = new MajorityWins();
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5};
        int x = 4, y = 5;
        int n = arr.length;
        System.out.println(solution.majorityWins(arr, n, x, y));
    }

}
