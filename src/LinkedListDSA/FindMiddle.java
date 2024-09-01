package LinkedListDSA;

public class FindMiddle {
    public static int findMiddle(Node head) {
        // Edge case: If the list is empty
        if (head == null) {
            return -1;  // Or throw an exception or return an appropriate message
        }

        Node slow = head;
        Node fast = head;

        // Traverse the list until `fast` reaches the end
        do {
            fast = fast.next.next;
            slow = slow.next;
        } while (fast != head && fast.next != head);

        // `slow` now points to the middle node
        return slow.data;
    }

    public static void main(String[] args) {
        // Example 1: LinkedList: 1 <--> 2 <--> 3 (Circular)
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // Connecting nodes in a circular doubly linked list manner
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = head;
        head.prev = third;

        // Finding the middle element
        System.out.println(FindMiddle.findMiddle(head));  // Expected Output: 2
    }
}
