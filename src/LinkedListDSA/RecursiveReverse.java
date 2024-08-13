package LinkedListDSA;

public class RecursiveReverse {


    static Node head;
//    static class Node {
//
//        int data;
//        ReverseALinked.Node next;
//
//        Node(int d)
//        {
//            data = d;
//            next = null;
//        }
//    }

     Node recRev(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node rest_head = recRev(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }

    void printlist(Node head) {

         while(head != null){
             System.out.print(head.data + " ");
             head = head.next;
         }
    }
    public static void main(String[] args) {

        RecursiveReverse list = new RecursiveReverse();
        list.head = new Node(24);
        list.head.next = new Node(45);
        list.head.next.next = new Node(33);
        list.head.next.next.next = new Node(25);

        head = list.recRev(head);

        list.printlist(head);
    }
}
