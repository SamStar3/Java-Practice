package StackDSA;

public class Test {

    public static void main(String[] args) {
        MyStack s = new MyStack();

        s.push(1);
        s.push(2);
        System.out.println(s.pop());
        s.push(3);
        System.out.println(s.isEmpty());
    }
}
