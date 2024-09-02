package LinkedListDSA;

public class IsDoubly {

    public static boolean isCircular(Node head) {
        // Edge case: If the list is empty, it cannot be circular
        if (head == null) {
            return false;
        }

        // Start from the head and move to the last node
        Node temp = head;

        while (temp.next != null && temp.next != head) {
            temp = temp.next;
        }

        // If the last node's next points to head and head's prev points to the last node, it's circular
        if (temp.next == head && head.prev == temp) {
            return true;
        }

        return false;  // The list is not circular
    }

    public static void main(String[] args) {
        // Example 1: Not circular
        Node head1 = new Node(2);
        Node second1 = new Node(3);
        Node third1 = new Node(4);
        Node fourth1 = new Node(5);
        Node fifth1 = new Node(6);

        head1.next = second1;
        second1.prev = head1;
        second1.next = third1;
        third1.prev = second1;
        third1.next = fourth1;
        fourth1.prev = third1;
        fourth1.next = fifth1;
        fifth1.prev = fourth1;

        System.out.println(IsDoubly.isCircular(head1));  // Expected Output: false (0)

        // Example 2: Circular
        Node head2 = new Node(4);
        Node second2 = new Node(6);

        head2.next = second2;
        second2.prev = head2;
        second2.next = head2;  // Making it circular
        head2.prev = second2;

        System.out.println(IsDoubly.isCircular(head2));  // Expected Output: true (1)
    }
}
