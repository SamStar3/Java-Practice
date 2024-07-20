package LinkedListDSA;

public class InsertGivenPOs {

    Node head;

    class Node{
        int data;
        Node next;

    }

//    Node insertPos(Node head, int pos, int data) {

//        Node temp = new Node(data);
//        if (pos == 1) {
//            temp.next = temp;
//            return temp;
//        }
//        Node curr = head;
//        for (int i = 1; i < pos - 2; && curr != null; i++) {
//            curr = curr.next;
//        }
//        if (curr == null) {
//            return head;
//        }
//        temp.next = curr.next;
//        curr.next = temp;
//        return head;
//    }

//    public void insertAfter(Node prev_node, int new_data)
//    {
//        /* 1. Check if the given Node is null */
//        if (prev_node == null) {
//            System.out.println(
//                    "The given previous node cannot be null");
//            return;
//        }
//
//	/* 2. Allocate the Node &
//	3. Put in the data*/
//        Node new_node = new Node(5);
//
//        /* 4. Make next of new Node as next of prev_node */
//        new_node.next = prev_node.next;
//
//        /* 5. make next of prev_node as new_node */
//        prev_node.next = new_node;
//    }
    public static void main(String[] args) {

//        insertPos(2,3,5);
    }
}
