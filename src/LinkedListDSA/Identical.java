package LinkedListDSA;

public class Identical {

    public boolean areIdentical(Node head1, Node head2) {
        // Traverse both lists simultaneously
        while (head1 != null && head2 != null) {
            // Compare data of the current nodes
            if (head1.data != head2.data) {
                return false; // If data differs, lists are not identical
            }
            // Move to the next nodes
            head1 = head1.next;
            head2 = head2.next;
        }

        // If one list is longer than the other
        if (head1 != null || head2 != null) {
            return false; // Lists are not identical
        }

        // If we reached here, both lists are identical
        return true;
    }
}
