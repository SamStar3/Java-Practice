package LinkedListDSA;

public class Search {

    static class Node {
        int data;
        Node next;
    }
    static int search(Node head, int x) {

        int pos = 1;
        Node curr = head;
        while(curr != null) {
            if (curr.data == x) {
                return pos;
            }else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }

    static Node add(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static void main(String args[])
    {
        // Start with the empty list /
        Node head = null;

        // Use push() function to construct
        // the below list 8 . 23 . 11 . 29 . 12 /
        head = add(head, 12);
        head = add(head, 29);
        head = add(head, 11);
        head = add(head, 23);
        head = add(head, 8);

//        head = removeLastNode(head);
//        for (DeleteLast.Node temp = head; temp != null; temp = temp.next)
//            System.out.print(temp.data + " ");

        System.out.println("Position : " + search(head,29));
    }

}
