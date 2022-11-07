import queue.circularQueue;
import queue.linearQueue;

public class Queue { 
    public static void main(String[] args){
        linearQueue lq = new linearQueue(5);
        lq.isFull();
        lq.isEmpty();
        lq.Enque(1);
        lq.Enque(2);
        lq.Enque(3);
        lq.Enque(4);
        lq.Enque(5);
        lq.Enque(6);
        lq.Deque();
        lq.Deque();
        lq.Deque();
        lq.Deque();
        lq.Deque();
        lq.Deque();
        lq.isFull();
        lq.isEmpty();
        circularQueue cq = new circularQueue(5);
        cq.isFull();
        cq.isEmpty();
        cq.Enque(1);
        cq.Enque(2);
        cq.Enque(3);
        cq.Enque(4);
        cq.Enque(5);
        cq.Enque(6);
        cq.Deque();
        cq.Deque();
        cq.Deque();
        cq.Deque();
        cq.Deque();
        cq.Deque();
        cq.isFull();
        cq.isEmpty();
        
    }
}
