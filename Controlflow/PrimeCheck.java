import java.util.*;
class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = number > 1;
        for (int i = 2; i <= number / 2 && isPrime; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("Prime Number");
        }
        else
            System.out.println("Not a Prime Number");
    }
}

