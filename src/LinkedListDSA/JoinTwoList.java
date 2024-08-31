package LinkedListDSA;

public class JoinTwoList {

    public static Node joinTheLists(Node head1, Node head2) {
        // If the first list is empty, return head2 as the new head.
        if (head1 == null) {
            return head2;
        }

        // If the second list is empty, return head1 as the new head.
        if (head2 == null) {
            return head1;
        }

        // Traverse to the end of the first list.
        Node current = head1;
        while (current.next != null) {
            current = current.next;
        }

        // Link the tail of the first list to the head of the second list.
        current.next = head2;

        // Return the head of the first list.
        return head1;
    }

    public static void main(String[] args) {
        // Creating first linked list: 1->2->9->6->5->7
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(6);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(7);

        // Creating second linked list: 99->8->4
        Node head2 = new Node(99);
        head2.next = new Node(8);
        head2.next.next = new Node(4);

        // Create an instance of Join and join the two lists
        JoinTwoList join = new JoinTwoList();
        Node newHead = join.joinTheLists(head1, head2);

        // Print the combined linked list
        printList(newHead); // Output should be: 1->2->9->6->5->7->99->8->4
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }
}
