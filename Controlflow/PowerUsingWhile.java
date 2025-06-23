import java.util.*;
public class PowerUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number");
        int n = sc.nextInt();
        System.out.print("Enter power");
        int pow= sc.nextInt();
        int result = 1;
        int counter = 0;
        while (counter < pow) {
            result *= n;
            counter++;
            
        }
        System.out.println(n + "raised to the power" + pow + " is" +result);
    }
}
