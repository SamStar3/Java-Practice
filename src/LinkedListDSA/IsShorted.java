package LinkedListDSA;

public class IsShorted {

    public static boolean isSorted(Node head)
    {
        // your code here
        if (head == null || head.next == null) {
            return true;
        }

        boolean nonIncreasing = true;
        boolean nonDecreasing = true;

        Node current = head;

        // Traverse the list
        while (current.next != null) {
            if (current.data > current.next.data) {
                nonDecreasing = false;  // Violates non-decreasing
            }
            if (current.data < current.next.data) {
                nonIncreasing = false;  // Violates non-increasing
            }
            current = current.next;
        }

        // List is sorted if it's either non-increasing or non-decreasing
        return nonIncreasing || nonDecreasing;
    }

    public static void printResult(Node head) {
        if (isSorted(head)) {
            System.out.println(1);  // 1 indicates the list is sorted
        } else {
            System.out.println(0);  // 0 indicates the list is not sorted
        }
    }

    public static void main(String[] args) {
        // Example 1: LinkedList: 5 -> 5 -> 6 -> 7 -> 8
        Node head1 = new Node(5);
        head1.next = new Node(5);
        head1.next.next = new Node(6);
        head1.next.next.next = new Node(7);
        head1.next.next.next.next = new Node(8);
        IsShorted.printResult(head1);  // Expected Output: 1

        // Example 2: LinkedList: 2 -> 5 -> 7 -> 8 -> 99 -> 7
        Node head2 = new Node(2);
        head2.next = new Node(5);
        head2.next.next = new Node(7);
        head2.next.next.next = new Node(8);
        head2.next.next.next.next = new Node(99);
        head2.next.next.next.next.next = new Node(7);
        IsShorted.printResult(head2);  // Expected Output: 0
    }
}
