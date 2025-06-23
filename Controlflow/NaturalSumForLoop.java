import java.util.*;
public class NaturalSumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n<=0) {
            System.out.println("Please enter a natural number");
        }
        else {
            int sum = 0;
            for (int i=1; i<= n; i++) {
                sum += i;
            }
            int Sum = n*(n + 1) / 2;
            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + Sum);
            System.out.println("Are both sums equal? " + (sum == Sum));
        }
    }
}
