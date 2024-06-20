package HashingDSA;

public class LinearProbing {

    int[] linearProbing(int hash_size, int arr[], int sizeOfArray) {
        // Initialize the hash table with -1
        int[] hashTable = new int[hash_size];
        for (int i = 0; i < hash_size; i++) {
            hashTable[i] = -1;
        }

        // Iterate over each element in the array
        for (int i = 0; i < sizeOfArray; i++) {
            int element = arr[i];
            int hashIndex = element % hash_size;

            // Handle collisions using linear probing
            while (hashTable[hashIndex] != -1) {
                hashIndex = (hashIndex + 1) % hash_size;
                // If we've looped back to the start and found no empty slot, break the loop
                if (hashIndex == element % hash_size) {
                    break;
                }
            }

            // Place the element in the found slot if it's empty
            if (hashTable[hashIndex] == -1) {
                hashTable[hashIndex] = element;
            }
        }

        return hashTable;
    }

    public static void main(String[] args) {
        LinearProbing sol = new LinearProbing();

        int hashSize1 = 10;
        int[] array1 = {4, 14, 24, 44};
        int sizeOfArray1 = array1.length;
        int[] result1 = sol.linearProbing(hashSize1, array1, sizeOfArray1);

        System.out.println("Hash Table 1:");
        for (int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}

