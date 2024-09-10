package StackDSA;

import java.util.ArrayList;

public class MyStack {

//    int arr[];
//    int cap;
//    int top;
//
//    MyStack(int c) {
//        top = -1;
//        cap = c;
//        arr = new int[cap];
//    }
//    void push(int x) {
//        if (top == (cap - 1)) {
//            System.out.println("Our Stack is Over Flow");
//        }
//        top++;
//        arr[top] = x;
//    }
//    int pop(){
//        if (top == -1){
//            return -1;
//        }
//        int res = arr[top];
//        top--;
//        return res;
//    }
//    int peek(){
//        if (top == -1) {
//            return -1;
//        }
//        return arr[top];
//    }
//    int size() {
//        return top+1;
//    }
//    boolean isEmpty(){
//        return (top == -1);
//    }
//    void print(){
//    for(int i = top;i>-1;i--){
//        System.out.print(" "+ a[i]);
//    }

    ArrayList<Integer> al = new ArrayList<>();

    void push(int x) {
        al.add(x);
    }

    int pop(){
        int res = al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }
    int peek(){
        return al.get(al.size()-1);
    }
    boolean isEmpty(){
        return al.isEmpty();
    }
    int size(){
        return al.size();
    }
}
