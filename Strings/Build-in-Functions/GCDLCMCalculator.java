import java.util.*;
public class GCDLCMCalculator {
    public static int getInput(String label, Scanner scanner) {
        System.out.print("Enter " + label + " number: ");
        return scanner.nextInt();
    }

    public static int gcd(int a, int b) {
        if (b == 0){
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void displayResults(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getInput("first", scanner);
        int num2 = getInput("second", scanner);
        int gcdValue = gcd(num1, num2);
        int lcmValue = lcm(num1, num2);
        displayResults(num1, num2, gcdValue, lcmValue);
    }
}
