class QueueOfString {
    int capacity, head, tail;
    String[] queue;

    QueueOfString(int capacity) {
        this.capacity = capacity;
        this.queue = new String[capacity];
        this.head = -1;
        this.tail = -1;
    }

    void Enque(String val) {
        if (this.tail + 1 == this.capacity) {
            System.out.println("queue is overflow");
        } else {
            if (this.head == -1) {
                this.head++;
            }
            this.tail++;
            queue[this.tail] = val;
            System.out.println(val + " is added in the Queue.");
        }
    }

    void Deque() {
        if (this.head == this.tail) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println(queue[this.head] + " is removed from the Queue");
            this.head++;
        }
    }

    void Size() {
        if (this.head == this.tail) {
            System.out.println("Queue is Empty");
        } else {
            int count = 0;
            for (int i = this.head; i <= this.tail; i++) {
                count++;
            }
            System.out.println(count + " is the Current size of Queue");
        }
    }

    void isEmpty() {
        if (this.head == this.tail) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue is Not Empty");
        }
    }

}

class QueueofInt {
    int capacity, head, tail;
    int[] queue;

    QueueofInt(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.head = -1;
        this.tail = -1;
    }

    void Enque(int val) {
        if (this.tail + 1 == this.capacity) {
            System.out.println("queue is overflow");
        } else {
            if (this.head == -1) {
                this.head++;
            }
            this.tail++;
            queue[this.tail] = val;
            System.out.println(val + " is added in the Queue.");
        }
    }

    void Deque() {
        if (this.head == this.tail) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println(queue[this.head] + " is removed from the Queue");
            this.head++;
        }
    }

    void Size() {
        if (this.head == this.tail) {
            System.out.println("Queue is Empty");
        } else {
            int count = 0;
            for (int i = this.head; i <= this.tail; i++) {
                count++;
            }
            System.out.println(count + " is the Current size of Queue");
        }
    }

    void isEmpty() {
        if (this.head == this.tail) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue is Not Empty");
        }
    }
}

public class Queue {
    public static void main(String[] args) {
        int capacity = 100;
        QueueofInt queue = new QueueofInt(capacity);
        queue.isEmpty();
        queue.Enque(23);
        queue.Enque(45);
        queue.Enque(13);
        queue.Enque(45);
        queue.Enque(11);
        queue.Enque(34);
        queue.Size();
        queue.Deque();
        queue.Size();
        queue.Deque();
        queue.Size();
        queue.isEmpty();

    }

}
