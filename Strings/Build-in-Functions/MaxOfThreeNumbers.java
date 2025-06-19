import java.util.*;
public class MaxOfThreeNumbers {

    public static int getInput(String message, Scanner sc) {
        System.out.print(message);
        return sc.nextInt();
    }

    public static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = getInput("Enter first number", sc);
        int num2 = getInput("Enter second number", sc);
        int num3 = getInput("Enter third number", sc);
        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum of the three numbers is" + max);

    }
}
