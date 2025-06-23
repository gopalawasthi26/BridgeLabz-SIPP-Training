import java.util.*;
public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start number");
        int cnt = sc.nextInt();
        for (int i = cnt; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
