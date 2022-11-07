import java.util.Scanner;

class StackOfString {
    int top, capacity;
    String[] StackOfString;

    StackOfString(int capacity) {
        this.capacity = capacity;
        this.StackOfString = new String[capacity];
        top = -1;
    }

    void push(String value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            StackOfString[top] = value;
            System.out.println(value + " is added in Stack");
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(StackOfString[top] + " is poped from Stack");
            top--;
        }
    }

    int LengthOfStack() {
        if (isEmpty()) {
            return 0;
        }
        return top + 1;
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    void Print() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(StackOfString[i]);
            }
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the capacity of Stack");
        int capacity = input.nextInt();
        StackOfString stack = new StackOfString(capacity);
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Length of Stack");
            System.out.println("4. Is Empty");
            System.out.println("5. Print");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value");
                    String value = input.next();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println("Length of Stack is " + stack.LengthOfStack());
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 5:
                    stack.Print();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);

    }
}
