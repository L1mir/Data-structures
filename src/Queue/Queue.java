package Queue;

public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int value) {
        if (rear == maxSize - 1) {
            rear = -1; // Wrap around
        }
        queueArray[++rear] = value;
        nItems++;
    }

    public int dequeue() {
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0; // Wrap around
        }
        nItems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public int top() {
        return queueArray[front];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Top element: " + queue.top());

        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }
}