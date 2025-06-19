import java.util.*;
public class RecursiveFactorial {
    public static int getInput(Scanner sc) {
        System.out.print("Enter a non-negative integer");
        return sc.nextInt();
    }

    public static long factorial(int n) {
        if (n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void displayResult(int n, long fact) {
        System.out.println("Factorial of " + n + " is " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = getInput(sc);
        long result = factorial(n);
        displayResult(n, result);
    }
}
