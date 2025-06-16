import java.util.*;
public class PowerUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number");
        int n = sc.nextInt();
        System.out.print("Enter power");
        int pow= sc.nextInt();
        int result = 1;
        for (int i = 1; i <= pow; i++) {
            result *= n;
        }
        System.out.println(n +" raised to the power " + pow+ "is" + result);
    }
}
