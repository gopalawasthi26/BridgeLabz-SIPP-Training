import java.util.*;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int gf = 1;
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                gf = i;
                break;
            }
        }
        System.out.println("The greatest factor of "+ n + "is " + gf);
    }
}
