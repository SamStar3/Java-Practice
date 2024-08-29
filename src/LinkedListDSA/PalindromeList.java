package LinkedListDSA;

import java.nio.file.attribute.UserPrincipalLookupService;

public class PalindromeList {

    Node head;
    Node slow, fast,second;

    boolean isPalindrome (Node head) {
        slow = head;
        fast = head;
        Node prev = head;
        Node midnode = null;
        boolean res = true;

        if (head != null && head.next != null) {
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                prev = slow;
                slow = slow.next;
            }
            if (fast != null) {
                midnode = slow;
                slow = slow.next;
            }
            second = slow;
            prev.next = null;
            reverse();

            if (midnode != null) {
                prev.next = midnode;
                midnode.next = second;
            }else {
                prev.next = second;
            }
        }

        return res;
    }
    void reverse() {
        Node prev = null;
        Node current = second;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        second = prev;
    }

    boolean compareLists(Node head1, Node head2)
    {
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data == temp2.data) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else
                return false;
        }

        /* Both are empty return 1*/
        if (temp1 == null && temp2 == null)
            return true;

		/* Will reach here when one is NULL
		and other is not */
        return false;
    }

    public void push(char new_data)
    {
		/* Allocate the Node &
		Put in the data */
        Node new_node = new Node(new_data);

        /* link the old list of the new one */
        new_node.next = head;

        /* Move the head to point to new Node */
        head = new_node;
    }

    void printList(Node ptr)
    {
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args)
    {

        /* Start with the empty list */
        PalindromeList llist = new PalindromeList();

        char str[] = { 'a', 'b', 'a', 'c', 'a', 'b', 'a' };
        String string = new String(str);
        for (int i = 0; i < 7; i++) {
            llist.push(str[i]);
        }
        if (llist.isPalindrome(llist.head) != false) {
            System.out.println("Is Palindrome");
            System.out.println("");
        }
        else {
            System.out.println("Not Palindrome");
            System.out.println("");
        }
    }
}
