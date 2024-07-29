package LinkedListDSA;

public class DeleteHeadCir {

    Node delHead(Node head ) {
        if (head == null) {
            return null;
        }
        if (head.next == head) {
            return null;
        }
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next =head.next;
        return curr.next;
    }
}
