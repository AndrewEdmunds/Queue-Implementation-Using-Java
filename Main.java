public class Main {
    public static void main(String[] args) {
        // Create a queue with capacity 5
        Queue queue = new Queue(5);

        // Test queue methods
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Front element: " + queue.peek()); // Should print 1
        
        // Dequeue an element
        int dequeuedElement = queue.dequeue();
        System.out.println("Dequeued element: " + dequeuedElement); // Should print 1
        System.out.println("Front element after dequeue: " + queue.peek()); // Should print 2
        
        // Enqueue additional elements
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(dequeuedElement);
        
        // Check if the queue is full after enqueuing elements
        System.out.println("Queue is full: " + queue.isFull()); // Should print true
        
        // Delete the queue
        queue.deleteQueue();
        System.out.println("Queue is empty: " + queue.isEmpty()); // Should print true
    }
}


