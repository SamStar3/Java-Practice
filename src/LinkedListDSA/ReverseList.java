package LinkedListDSA;

public class ReverseList {

    Node reverseList(Node head) {
        // Initialize three pointers: previous, current, and next
        Node prev = null;
        Node current = head;
        Node next = null;

        // Traverse through the list
        while (current != null) {
            // Store the next node
            next = current.next;

            // Reverse the current node's pointer
            current.next = prev;

            // Move the pointers one position ahead
            prev = current;
            current = next;
        }

        // At the end, prev will be the new head of the reversed list
        return prev;
    }
    public static void main(String[] args) {
        // Creating a linked list: 1->2->3->4->5->6
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        // Create an instance of Solution and reverse the list
        ReverseList solution = new ReverseList();
        head = solution.reverseList(head);

        // Print the reversed linked list
        printList(head); // Output should be: 6->5->4->3->2->1
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
