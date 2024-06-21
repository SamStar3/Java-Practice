package HashingDSA;

public class QuadraticProbing {

    static void quadraticProbing(int[] hash, int hashSize, int arr[], int N) {
        for (int i = 0; i < N; i++) {
            int key = arr[i];
            int hashIndex = key % hashSize;
            int step = 0;

            // Search for the next available position using quadratic probing
            while (hash[hashIndex] != -1 && hash[hashIndex] != key) {
                step++;
                hashIndex = (key + step * step) % hashSize;
            }

            // Insert the key in the found position if it is empty
            if (hash[hashIndex] == -1) {
                hash[hashIndex] = key;
            }
        }
    }

    public static void main(String[] args) {
        int hashSize = 11;
        int N = 4;
        int arr[] = {21, 10, 32, 43};
        int[] hash = new int[hashSize];

        // Initialize the hash table with -1 indicating empty slots
        for (int i = 0; i < hashSize; i++) {
            hash[i] = -1;
        }

        quadraticProbing(hash, hashSize, arr, N);

        for (int i = 0; i < hashSize; i++) {
            System.out.print(hash[i] + " ");
        }
    }
}
