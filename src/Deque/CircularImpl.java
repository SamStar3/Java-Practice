package Deque;

public class CircularImpl {

    int size, cap,front;
    int arr[];

    CircularImpl(int c){
        front = 0;
        cap = c;
        size =0;
        arr = new int[cap];
    }

    boolean isEmpty(){
        return (size == 0);
    }
    boolean isFull(){
        return  (size == cap);
    }
    void deleteFront(){
        if (isEmpty()){
            return;
        }
        front = (front + 1) % cap;
        size--;
    }

    void insertRear(int x){
        if (isFull()){
            return;
        }
        int newrear = (front + size) % cap;
        arr[newrear] = x;
        size++;
    }

    int getFront(){
        if (isEmpty()){
            return -1;
        }else {
            return front;
        }
    }

    void insertFront(int x){
        if (isFull()){
            return;
        }
        front =(front + cap - 1) % cap;
        arr[front] = x;
        size++;
    }

    void deleteRear(){
        if (isEmpty()){
            return;
        }
        size--;
    }

    int getRear(){
        if (isEmpty()){
            return -1;
        }else {
            return (front +size - 1) % cap;
        }
    }

    public static void main(String[] args){
        CircularImpl dq = new CircularImpl(5);

        // Function calls
        System.out.println(
                "Insert element at rear end  : 5 ");
        dq.insertRear(5);

        System.out.println(
                "insert element at rear end : 10 ");
        dq.insertRear(10);

        System.out.println("get rear element : "
                + dq.getRear());

        dq.deleteRear();
        System.out.println(
                "After delete rear element new rear become : "
                        + dq.getRear());

        System.out.println(
                "inserting element at front end");
        dq.insertFront(15);

        System.out.println("get front element: "
                + dq.getFront());

        dq.deleteFront();

        System.out.println(
                "After delete front element new front become : "
                        + +dq.getFront());
    }
}
