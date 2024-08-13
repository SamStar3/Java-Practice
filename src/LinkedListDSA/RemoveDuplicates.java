package LinkedListDSA;

public class RemoveDuplicates {

    static Node head;
    void removeDup(Node head){
        Node curr = head;
        while (curr != null && curr.next != null){
            if (curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
    }
    void printlist(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        RemoveDuplicates list = new RemoveDuplicates();

        list.head = new Node(24);
        list.head.next = new Node(24);
        list.head.next.next = new Node(22);
        list.head.next.next = new Node(22);
        list.head.next.next = new Node(22);

        list.removeDup(head);
        list.printlist(head);
    }
}
