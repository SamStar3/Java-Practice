package LinkedListDSA;

public class InsertEndCirc {

    static Node insertEnd(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        }else {
            Node curr = head;
            while (curr.next != head) {
                curr =curr.next;
            }
            curr.next = temp;
            temp.next = head;
            return head;
        }
    }

    public static void main(String args[])
    {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=head;
        head=insertEnd(head,15);
//        printlist(head);

    }
}
