import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println(" Add");
        System.out.println(" Subtract");
        System.out.println(" Multiply");
        System.out.println(" Divide");

        System.out.print("Choose an operation");
        int choice = scanner.nextInt();

        System.out.print("Enter first number ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number ");
        double num2 = scanner.nextDouble();

        double result = 0;

        if (choice == 1) {
            result = num1 + num2;
        }
        else if (choice == 2) {
            result = num1 - num2;
        } 
        else if (choice == 3) {
            result = num1 * num2;
        } 
        else if (choice == 4) {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero.");
                return;
            }
            result = num1 / num2;
        }
        else {
            System.out.println("Invalid choice.");
            return;
        }
        System.out.println("Result: " + result);
    }
}
