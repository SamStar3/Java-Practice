package StackDSA;

import java.util.Stack;

public class DeleteMidStack {
    private void deleteMidUtil(Stack<Integer> s, int currentIndex, int mid) {

        if(currentIndex == mid){
            s.pop();
            return;
        }

        int temp = s.pop();

        deleteMidUtil(s,currentIndex+ 1,mid);

        s.push(temp);
    }
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        // code here

        int mid = sizeOfStack / 2;

        deleteMidUtil(s,0,mid);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Original stack: " + stack);

        DeleteMidStack sol = new DeleteMidStack();
        sol.deleteMid(stack, stack.size());

        System.out.println("Stack after deleting middle: " + stack);
    }
}
