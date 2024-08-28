package LinkedListDSA;


import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;



public class MergeKSort {
    // Function to merge k sorted linked lists.
    Node mergeKLists(List<Node> arr) {
        // Base case: if the array is empty, return null.
        if (arr == null || arr.isEmpty()) {
            return null;
        }

        // Define a min-heap (priority queue) to store the nodes by their values.
        PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> a.data - b.data);

        // Insert the head of each linked list into the min-heap.
        for (Node head : arr) {
            if (head != null) {
                minHeap.offer(head);
            }
        }

        // Create a dummy node to simplify the merge process.
        Node dummy = new Node(0);
        Node tail = dummy;

        // Merge the linked lists.
        while (!minHeap.isEmpty()) {
            // Extract the smallest node from the heap.
            Node smallest = minHeap.poll();

            // Add the smallest node to the result list.
            tail.next = smallest;
            tail = tail.next;

            // If the extracted node has a next node, insert it into the heap.
            if (smallest.next != null) {
                minHeap.offer(smallest.next);
            }
        }

        // The merged list starts from the next of dummy node.
        return dummy.next;
    }
    public static void main(String[] args) {
        // Create individual linked lists.
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        Node list3 = new Node(0);
        list3.next = new Node(9);
        list3.next.next = new Node(10);

        // Add all linked lists to the list.
        List<Node> arr = new ArrayList<>();
        arr.add(list1);
        arr.add(list2);
        arr.add(list3);

        // Merge the linked lists.
        MergeKSort solution = new MergeKSort();
        Node mergedHead = solution.mergeKLists(arr);

        // Print the merged linked list.
        printList(mergedHead);
    }
    public static  void printList(Node node) {
    while (node != null) {
        System.out.print(node.data + "->");
        node = node.next;
    }
    System.out.println("null");
}
}


