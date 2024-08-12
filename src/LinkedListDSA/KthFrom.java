package LinkedListDSA;

public class KthFrom {


    int getKthFromLast(Node head, int k) {
        if (head == null || k <= 0) {
            return -1;
        }

        Node first = head;
        Node second = head;

        // Move the first pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (first == null) {
                return -1; // k is larger than the number of nodes
            }
            first = first.next;
        }

        // Move both pointers until the first one reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Now, second points to the kth node from the end
        return second.data;
    }
}
