import java.util.*;
class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int max = 10;
        int[] factors = new int[max];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (idx == max) {
                    max *= 2;
                    factors = Arrays.copyOf(factors, max);
                }
                factors[idx++] = i;
            }
        }
        System.out.print("Factors");
        for (int i = 0; i < idx; i++){
            System.out.print(factors[i] + " ");
        }
    }
}