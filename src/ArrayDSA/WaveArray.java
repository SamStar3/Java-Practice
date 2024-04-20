package ArrayDSA;

public class WaveArray {
        public static void convertToWave(int n, int[] a) {
            for (int i = 1; i < n; i += 2) {
                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int n = arr.length;

            System.out.print("Original array: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();

            convertToWave(n, arr);

            System.out.print("Wave-like array: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
