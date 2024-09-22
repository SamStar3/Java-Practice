package StackDSA;

import java.util.Scanner;

public class TwoStacksInArray {

    int[] arr;  // Array to hold elements of both stacks
    int top1, top2;  // Pointers for top of stack1 and stack2
    int size;  // Maximum size of the array

    // Constructor to initialize two stacks in one array of size 'n'
    TwoStacksInArray(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;  // Stack 1 starts from index 0
        top2 = n;   // Stack 2 starts from the end (index n-1)
    }

    // Function to push an integer into stack1.
    void push1(int x) {
        if (top1 < top2 - 1) {  // There should be space between the two stacks
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Function to push an integer into stack2.
    void push2(int x) {
        if (top1 < top2 - 1) {  // There should be space between the two stacks
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Function to remove an element from the top of stack1.
    int pop1() {
        if (top1 >= 0) {  // Stack 1 has elements
            int x = arr[top1];
            top1--;
            return x;
        } else {
            return -1;  // Stack 1 is empty
        }
    }

    // Function to remove an element from the top of stack2.
    int pop2() {
        if (top2 < size) {  // Stack 2 has elements
            int x = arr[top2];
            top2++;
            return x;
        } else {
            return -1;  // Stack 2 is empty
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an instance of twoStacks with a size of 100 (you can adjust this size)
        TwoStacksInArray g = new TwoStacksInArray(100);

        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            int queryType = sc.nextInt();
            if (queryType == 1) {
                // Push to stack1 or stack2
                int stackNum = sc.nextInt();
                int value = sc.nextInt();
                if (stackNum == 1) {
                    g.push1(value);
                } else if (stackNum == 2) {
                    g.push2(value);
                }
            } else if (queryType == 2) {
                // Pop from stack1 or stack2
                int stackNum = sc.nextInt();
                if (stackNum == 1) {
                    System.out.print(g.pop1() + " ");
                } else if (stackNum == 2) {
                    System.out.print(g.pop2() + " ");
                }
            }
        }
        sc.close();
    }
}
