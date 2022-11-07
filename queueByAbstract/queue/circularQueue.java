
package queue;


public class circularQueue extends functions{
    int capacity,head,tail;
    int[] queue;
    public circularQueue(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        head =-1;
        tail =-1;
    }
    public void Enque(int val){
        if(isFull()){
            System.out.println("queue is full");
        }else{
            if(head == -1){
                head++;
            }
            tail = (tail+1)%capacity;
            queue[tail]=val;
            System.out.println(queue[tail] + " is added");
        }
        
    }
    public void Deque(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }else{
            System.out.println(queue[head] + " is removed");
            head = (head+1)%capacity;
        }
    }
    public boolean isEmpty(){
        if(head == tail){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if((tail+1)%capacity == head){
            return true;
        }
        return false;
    }

}