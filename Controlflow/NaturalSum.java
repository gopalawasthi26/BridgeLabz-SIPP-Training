import java.util.*;
public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number.");
        }
        else {
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using loop " + sum);
            System.out.println("Sum using formula " + formulaSum);
            System.out.println("Are both sums equal " + (sum == formulaSum));
        }
    }
}
