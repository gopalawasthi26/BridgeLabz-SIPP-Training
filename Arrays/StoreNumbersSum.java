import java.util.*;
class StorenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] n = new double[10];
        double total = 0.0;
        int idx = 0;
        while (true) {
            System.out.print("Enter number");
            double num = sc.nextDouble();
            if (num <= 0 || idx == 10)
                break;
            n[idx++] = num;
        }
        for (int i = 0; i < idx; i++){
            total += n[i];
        }
        System.out.println("Total sum " + total);
        System.out.println("n entered");
        for (int i = 0; i < idx; i++){
            System.out.print(n[i] + " ");
        }
    }
}