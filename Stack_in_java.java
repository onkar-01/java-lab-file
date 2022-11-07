import java.util.*;

class Stack {
    int top, capacity;
    int[] stack;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack is Overflow");
        } else {
            top++;
            stack[top] = item;
            System.out.println("Item " + item + " is pushed to stack");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Item " + stack[top] + " is popped from stack");
            top--;
        }
    }

    public void Size() {
        System.out.println("Size of stack is " + (top + 1));
    }

    public void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

}

public class Stack_in_java {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Capacity");
        int capacity = input.nextInt();
        Stack s = new Stack(capacity);
        do {
            System.out.println("choose what you want to do : ");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. Size");
            System.out.println("4. isEmpty");
            System.out.println("5. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Item");
                    int item = input.nextInt();
                    s.push(item);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.Size();
                    break;
                case 4:
                    s.isEmpty();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Your choice is not valid");
            }
        } while (choice != 5);
    }

}