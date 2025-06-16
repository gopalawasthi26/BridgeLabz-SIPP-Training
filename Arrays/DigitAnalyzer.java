import java.util.*;
public class DigitAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxDigit = 10;
        int index = 0;
        int[] digits = new int[maxDigit];
        while (n != 0 && index < maxDigit) {
            digits[index++] = n % 10;
            n /= 10;
        }

        int largest = -1;
        int second = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }
        System.out.println("Largest" + largest);
        System.out.println("Second Largest" + (second == -1 ? "Not found" : second));
    }
}
