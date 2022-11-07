import java.util.Scanner;

class Element {
    int arr[], capacity;

    Element(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    int oneElemtent() {
        int element = 0;
        for (int i = 0; i <= capacity - 1; i++) {
            if (arr[i] != arr[i + 1]);
        }
        return element;
    }
}

public class oneElement {
    public static void main(String[] args) {
        int capacity;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the capacity of the array");
        capacity = input.nextInt();
        Element e = new Element(capacity);
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < e.arr.length; i++) {
            e.arr[i] = input.nextInt();
        }
        System.out.println("The element that occurs only once is " + e.oneElemtent());

    }
}