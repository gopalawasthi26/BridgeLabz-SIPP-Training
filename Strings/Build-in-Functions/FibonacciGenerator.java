import java.util.*;
public class FibonacciGenerator {
    public static void generateFibonacci(int terms) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print("Fibonacci Sequence" + a);
        if (terms > 1){
            System.out.print(" " + b);
        }
        for (int i = 3; i <= terms; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();
        generateFibonacci(terms);
    }
}
