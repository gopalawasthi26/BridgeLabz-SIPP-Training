import java.util.*;
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int[] res = new int[10];
        for (int i = 1; i <= 10; i++) {
            res[i - 1] = n * i;
            System.out.println(n + " * " + i + " = " + res[i - 1]);
        }
    }
}
