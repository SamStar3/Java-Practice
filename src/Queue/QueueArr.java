package Queue;

public class QueueArr {

    int front, rear;
    int arr[] = new int[100005];

    QueueArr()
    {
        front=0;
        rear=0;
    }

    //Function to push an element x in a queue.
    void push(int x)
    {
        // Your code here
        arr[rear] = x;
        rear++;
    }

    //Function to pop an element from queue and return that element.
    int pop()
    {
        // Your code here
        if(front == rear){
            return -1;
        }else {
            int result = arr[front];
            front++;
            return result;
        }
    }
}
