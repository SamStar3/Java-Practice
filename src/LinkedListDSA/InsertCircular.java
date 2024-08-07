package LinkedListDSA;

public class InsertCircular {

    public static void main(String args[])
    {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=head;
        head=insertBegin(head,15);
        printlist(head);

    }

    public static void printlist(Node head){
        if(head==null)return;
        Node r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }
    static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);

        if (head == null) {
            temp.next = temp;
        }else {
            Node curr = head;
            while(curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
        }
        return temp;
    }
}
