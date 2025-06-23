import java.util.*;
public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a n to check if it's prime ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime n.");
        }
        else {
            System.out.println(num + " is not a prime n.");
        }

        scanner.close();
    }
}
