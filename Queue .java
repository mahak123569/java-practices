public class Queue {
    static class MyQueue {
        int arr[];
        int size;
        int rear = -1;

        MyQueue(int n) {
            arr = new int[n];
            size = n;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // enqueue
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("full queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int front = arr[0];

            // shift elements left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;
            return front;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6); // will show "full queue"

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}