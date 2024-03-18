public class Queue {
    private int[] elements;
    private int size;
    private int capacity;

    // constructor
    public Queue(int capacity) {
        this.elements = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    // Methods
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[0];
    }

    public void enqueue(int element) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        elements[size++] = element;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int removedElement = elements[0];
        // Shift remaining elements to the left
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        // Reset the last element in the array
        elements[size - 1] = 0;
        size--;
        return removedElement;
    }

    public void deleteQueue() {
        size = 0;
    }
}
