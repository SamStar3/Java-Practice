package LinkedListDSA;

public class Traversal {

    static void printList(Node head) {
        if (head == null) {
            return;
        }
//        System.out.print(head.data + " ");
//        for (Node r = head.next; r != head; r = r.next) {
//            System.out.print(r.data + " ");
//        }

        Node r = head;
        do {
            System.out.print(r.data + " ");
            r = r.next;
        }while (r != head);
    }
}
