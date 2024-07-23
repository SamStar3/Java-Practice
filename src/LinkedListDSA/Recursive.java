package LinkedListDSA;

public class Recursive {

    /*void addNode(Node head_ref, int pos, int data)
    {
        // Your code here
        Node newNode = new Node(data);

        // If the list is empty
        if (head_ref == null) {
            head_ref = newNode;
            return;
        }

        // Traverse the list to find the node at position `pos`
        Node current = head_ref;
        for (int i = 0; i < pos; i++) {
            if (current != null) {
                current = current.next;
            } else {
                // If `pos` is greater than the length of the list, do nothing
                return;
            }
        }

        // Adjust the pointers to insert the new node after the `p`th node
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }

        current.next = newNode;
    }*/
}
