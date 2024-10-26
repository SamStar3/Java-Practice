package Queue;

public class Queue {

    int size, cab;
    int[] arr;
    Queue(int c) {
        cab = c;
        size = 0;
        arr = new int[cab];
    }

    void enque(int x){
        if (isFull()) return;
        arr[size] = x;
        size++;
    }
    void deque(){
        if (isEmpty()) return;

        for (int i = 0; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }
        size--;
    }

    int getFront(){
        if (isEmpty()){
            return -1;
        }else {
            return 0;
        }
    }

    int getRear(){
        if (isEmpty()){
            return -1;
        }else {
            return size - 1;
        }
    }

    boolean isFull(){
        return (size == cab);
    }

    boolean isEmpty(){
        return (size == 0);
    }

    void size(){

    }
}
