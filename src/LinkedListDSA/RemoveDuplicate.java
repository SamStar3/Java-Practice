package LinkedListDSA;

public class RemoveDuplicate {

    Node removeDuplicates(Node head) {
        // If the list is empty or has only one node, return the head
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize the current node as head
        Node current = head;

        // Traverse the linked list
        while (current != null && current.next != null) {
            // If current node is equal to the next node
            if (current.data == current.next.data) {
                // Skip the next node
                current.next = current.next.next;
            } else {
                // Move to the next node if no duplicate
                current = current.next;
            }
        }

        // Return the modified list's head
        return head;
    }
}
