import java.util.*;

class Prime {
    int rangeFrom, rangeTo;

    Prime(int rangeFrom, int rangeTo) {
        this.rangeFrom = rangeFrom;
        this.rangeTo = rangeTo;
    }

    public void printPrime() {
        for (int i = rangeFrom; i < rangeTo; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                } else if (j == i / 2) {
                    System.out.println(i);
                }
            }
        }
    }

}

class checkPrime {
    int number;

    checkPrime(int number) {
        this.number = number;
    }

    public void check() {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not Prime");
                break;
            } else {
                System.out.println(number + " is prime");
            }
        }
    }
}

public class PrimeNum {
    public static void main(String args[]) {
        int choice;
        do {
            System.out.println("choose what yo want to do:");
            System.out.println("1. Print Prime Numbers");
            System.out.println("2. Check Prime Number");
            System.out.println("3. Exit");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the range from");
                    int rangeFrom = input.nextInt();
                    System.out.println("Enter the range to");
                    int rangeTo = input.nextInt();
                    Prime p = new Prime(rangeFrom, rangeTo);
                    p.printPrime();
                    break;
                case 2:
                    System.out.println("Enter the number");
                    int number = input.nextInt();
                    checkPrime check = new checkPrime(number);
                    check.check();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Your Choice is not right");
            }
        } while (choice != 3);
    }
}
