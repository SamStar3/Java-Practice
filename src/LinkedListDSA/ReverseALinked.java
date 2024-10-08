package LinkedListDSA;

import ArrayLists.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseALinked {

//    Node revList(Node head) {
//
////        Node curr = head;
//
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//
//        for (Node curr = head; curr != null; curr = curr.next) {
//            arr.add(curr.data);
//        }
//        for (Node curr = head; curr != null; curr = curr.next) {
//            curr.data = arr.remove(arr.size() - 1);
//        }
//        return head;
//    }

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Function to reverse the linked list */
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        ReverseALinked list = new ReverseALinked();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
