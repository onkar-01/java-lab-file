import java.util.Scanner;


public class Factorial {
    static int factorial(int number) {
    if (number == 0) {
    return 1;
    }
    return (number * factorial(number - 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number = input.nextInt();
        int fact = factorial(number);
    }
}
