import java.util.Scanner;

public class CountParenthisis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the expression");
        String expression = input.nextLine();
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                countA++;
            } else if (expression.charAt(i) == ')') {
                countB++;
            }
        }
        if (countA == countB) {
            System.out.println("The expression is balanced");
        } else if (countA > countB) {
            System.out.println("The number of closing parenthesis to be added is " + (countA - countB));
        } else if (countA < countB) {
            System.out.println("The number of opening parenthesis to be added is " + (countB - countA));
        }
    }
}
