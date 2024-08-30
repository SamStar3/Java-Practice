package LinkedListDSA;

public class SortedWay {
    public Node sortedInsert(Node head, int x) {
    // Create a new node with the given value
    Node newNode = new Node(x);

    // Case 1: List is empty
    if (head == null) {
        return newNode;
    }

    // Case 2: Insert at the beginning of the list
    if (x <= head.data) {
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    }

    // Case 3: Traverse the list to find the correct position
    Node current = head;
    while (current.next != null && current.next.data < x) {
        current = current.next;
    }

    // Case 4: Insert in the middle or at the end of the list
    newNode.next = current.next;
    newNode.prev = current;

    if (current.next != null) {
        current.next.prev = newNode;
    }

    current.next = newNode;

    return head;
}
}