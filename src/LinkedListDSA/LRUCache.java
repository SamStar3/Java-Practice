package LinkedListDSA;

import java.util.*;

public class LRUCache {
    private class Node {
        int key, value;
        Node prev, next;
        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final int capacity;
    private final HashMap<Integer, Node> map;
    private final Node head, tail;

    // Constructor for initializing the cache capacity with the given value.
    LRUCache(int cap) {
        this.capacity = cap;
        this.map = new HashMap<>();
        // Initialize the head and tail nodes
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    // Function to return value corresponding to the key.
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        // Move the accessed node to the head of the linked list
        Node node = map.get(key);
        remove(node);
        insert(node);
        return node.value;
    }

    // Function for storing key-value pair.
    public void set(int key, int value) {
        if (map.containsKey(key)) {
            // If key exists, update the value and move it to the head
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insert(node);
        } else {
            // If key does not exist, create a new node
            if (map.size() == capacity) {
                // Remove the least recently used node
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            insert(newNode);
        }
    }

    // Helper function to remove a node from the linked list
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Helper function to insert a node right after the head
    private void insert(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}
