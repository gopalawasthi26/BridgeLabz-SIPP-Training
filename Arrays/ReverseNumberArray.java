import java.util.*;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a n");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        temp = n;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        System.out.print("Reversed n");
        for (int digit : digits) {
            System.out.print(digit);
        }
    }
}
