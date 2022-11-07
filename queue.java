class Queue{
    int front, rear, size;
    int[] queue;
    public Queue(int size){
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }
}

public class queue {
    public static void main(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Capacity");
        int capacity = input.nextInt();
        Queue q = new Queue(capacity);
        do {
            System.out.println("choose what you want to do : ");
            System.out.println("1. enqueue");
            System.out.println("2. dequeue");
            System.out.println("3. Size");
            System.out.println("4. isEmpty");
            System.out.println("5. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Item");
                    int item = input.nextInt();
                    q.enqueue(item);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.Size();
                    break;
                case 4:
                    q.isEmpty();
                    break;
            }
        } while (choice != 5);
    }
}
