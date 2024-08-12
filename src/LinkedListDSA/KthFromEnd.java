package LinkedListDSA;

import java.util.Scanner;

public class KthFromEnd {

    public Node swapKthNode(Node head, int k) {

        if (head == null || k <= 0) return head;

        // Find the length of the list
        int n = 0;
        Node temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // If k is greater than n, return the list as is
        if (k > n) return head;

        // If kth node from start and end are the same, no swap needed
        if (2 * k - 1 == n) return head;

        // Find the kth node from the beginning and its previous node
        Node x = head;
        Node x_prev = null;
        for (int i = 1; i < k; i++) {
            x_prev = x;
            x = x.next;
        }

        // Find the kth node from the end and its previous node
        Node y = head;
        Node y_prev = null;
        for (int i = 1; i < n - k + 1; i++) {
            y_prev = y;
            y = y.next;
        }

        // If x_prev exists, then adjust its next pointer
        if (x_prev != null) x_prev.next = y;

        // If y_prev exists, then adjust its next pointer
        if (y_prev != null) y_prev.next = x;

        // Swap next pointers of x and y
        Node tempNode = x.next;
        x.next = y.next;
        y.next = tempNode;

        // If x is the head, change head to y
        if (k == 1) head = y;

        // If y is the head, change head to x
        if (k == n) head = x;

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of nodes in linked list
        int k = sc.nextInt(); // Position k
        Node head = null, temp = null;

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                temp = head;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
        }

        KthFromEnd solution = new KthFromEnd();
        head = solution.swapKthNode(head, k);

        // Output the swapped list
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        sc.close();
    }
}
