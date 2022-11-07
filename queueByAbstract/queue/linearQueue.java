package queue;

public class linearQueue extends functions {
    int head,tail,capacity;
    int[] queue;
    public linearQueue(int capacity){
        this.capacity = capacity;
        queue = new int[this.capacity];
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
            tail++;
            queue[tail]=val;
            System.out.println(queue[tail] + " is added");
        }

    }
    public void Deque(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }else{
            System.out.println(queue[head] + " is removed");
            head++;
        }
    }

    public boolean isFull(){
        if(this.tail == capacity-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(this.head == this.tail){
            return true;
        }
        return false;
    }
    
}

