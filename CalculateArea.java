import java.util.*;

public class CalculateArea {
    public static float areaOfRectangle() {
        System.out.println("Enter the length and width of the rectangle:");
        Scanner input = new Scanner(System.in);
        float length = input.nextFloat();
        float width = input.nextFloat();
        float area = length * width;
        return area;
    }

    public static float areaOfTriangle() {
        System.out.println("Enter the base and height of the triangle:");
        Scanner input = new Scanner(System.in);
        float base = input.nextFloat();
        float height = input.nextFloat();
        float area = base * height / 2;
        return area;
    }

    public static double areaOfCircle() {
        System.out.println("Enter the radius of the circle:");
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        double area = 3.14 * (radius * radius);
        return area;
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Choose the figure you want to calculate the area of:");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    float areaOfRectangle = areaOfRectangle();
                    System.out.println("The area of the rectangle is " + areaOfRectangle);
                    break;
                case 2:
                    float areaOfTriangle = areaOfTriangle();
                    System.out.println("The area of the triangle is " + areaOfTriangle);
                    break;
                case 3:
                    double areaOfCircle = areaOfCircle();
                    System.out.println("The area of the circle is " + areaOfCircle);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 4);

    }
}
