package LinkedListDSA;

import java.util.ArrayList;

public class DisplayList {

    public static ArrayList<Integer> displayList(Node head) {
        // Create an ArrayList to store the linked list elements.
        ArrayList<Integer> result = new ArrayList<>();

        // Traverse the linked list and add each node's data to the ArrayList.
        Node current = head;
        while (current != null) {
            result.add(current.data);
            current = current.next;
        }

        // Return the ArrayList containing the linked list elements.
        return result;
    }


}
//public static void main(String[] args) {
//    // Creating a linked list: 1->2->3->4->5
//
////        DisplayList get = new DisplayList();
//    Node head = new Node(1);
//    head.next = new Node(2);
//    head.next.next = new Node(3);
//    head.next.next.next = new Node(4);
//    head.next.next.next.next = new Node(5);
//
//    // Create an instance of Get and display the list
//    Get get = new Get();
//    ArrayList<Integer> list = get.displayList(head);
//
//    // Print the ArrayList returned by displayList method
//    for (int value : list) {
//        System.out.print(value + " ");
//    }
//}
