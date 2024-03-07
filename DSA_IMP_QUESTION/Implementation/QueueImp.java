
public class QueueImp {
    
    private int[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public QueueImp(int capacity) {
        this.capacity = capacity;
        array =  new int [capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int data = array[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return array[front];
    }

    public static void main(String[] args) {
        QueueImp queue = new QueueImp(5);
        
        // Enqueue some elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
    
        System.out.println("Dequeued element: " + queue.dequeue()); 
     
        System.out.println("Front element: " + queue.peek()); 
        
    }
}
