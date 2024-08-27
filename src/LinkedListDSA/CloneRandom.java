package LinkedListDSA;

public class CloneRandom {

    Node copyList(Node head) {
        if (head == null) return null;

        // Step 1: Create new nodes and interweave them with the original nodes
        Node curr = head;
        while (curr != null) {
            Node newNode = new Node(curr.data);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        // Step 2: Set random pointers for the new nodes
        curr = head;
//        while (curr != null) {
//            if (curr.random != null) {
//                curr.next.random = curr.random.next;
//            }
//            curr = curr.next.next;
//        }

        // Step 3: Separate the original and copied lists
        curr = head;
        Node dummy = new Node(0); // Dummy node to help extract the copied list
        Node copyCurr = dummy;
        while (curr != null) {
            Node nextOriginal = curr.next.next;

            // Extract the copy
            Node copy = curr.next;
            copyCurr.next = copy;
            copyCurr = copy;

            // Restore the original list
            curr.next = nextOriginal;

            curr = nextOriginal;
        }

        // Return the head of the copied list
        return dummy.next;
    }
}
