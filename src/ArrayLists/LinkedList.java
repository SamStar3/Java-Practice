package ArrayLists;

public class LinkedList {

    LinkedList.Node head;
    class Node{
        int data;
        LinkedList.Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    LinkedList(){
        head = null;
    }
    public void insertBegin(int val) {
        LinkedList.Node newNode = new LinkedList.Node(val);

        if (head == null) {
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;

        }
    }
    public void display(){

        LinkedList.Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void insertPos(int pos, int val) {

        if (pos == 0) {
            insertBegin(val);
            return;
        }
        LinkedList.Node newNode = new LinkedList.Node(val);
        LinkedList.Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
            if (temp == null) {
                throw new IllegalArgumentException("Invalid Pos " + pos);
//                System.out.println("Invalid Positiin");
//                return;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
}
