import java.util.Scanner;

class Queue {
    int capacity, Head, Tail;
    String[] queue;

    Queue(int capacity) {
        this.capacity = capacity;
        this.Head = -1;
        this.Tail = -1;
        this.queue = new String[capacity];
    }

    void Enque(String val) {
        if ((this.Head + 1) % capacity == (this.Tail + 1) % capacity + 1) {
            System.out.println("Queue is overflow");
        } else {
            if (this.Head == -1) {
                this.Head = 0;
            }
            this.Tail = (Tail + 1) % capacity;
            queue[this.Tail] = val;
            System.out.println(val + " is added in queue");
        }

    }

    void Deque() {
        if ((this.Head + 1) % capacity == (this.Tail + 1) % capacity) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println(queue[this.Head] + " is removed from the queue");
            this.Head = (this.Head + 1) % capacity;
        }
    }

}

public class CircularQueue {
    public static void main(String[] args) {
        int capacity, choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the capacity Of your queue");
        capacity = input.nextInt();
        Queue queue = new Queue(capacity);
        do {
            System.out.println("1. Enque");
            System.out.println("2. Deque");
            System.out.println("5. Exit");
            System.out.print("Enter your Choice : ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter your Element ");
                    String Data = input.next();
                    queue.Enque(Data);
                    break;
                case 2:
                    queue.Deque();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 5);

    }

}
