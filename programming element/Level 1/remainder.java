import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number");
        int n1 = sc.nextInt();
        System.out.print("Enter second number");
        int n2 = sc.nextInt();
        int quotient = n1 / n2;
        int remainder = n1 % n2;
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                " of two numbers" + n1 + " and "+ n2);
    }
}
