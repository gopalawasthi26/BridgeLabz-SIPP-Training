import java.util.*;

public class FriendAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] h = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of "+ names[i] );
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] );
            h[i] = sc.nextDouble();
        }
        int youngIdx= 0, tallestIdx = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngIdx]) {
                youngIdx = i;
            }
            if (h[i] > h[tallestIdx]) {
                tallestIdx = i;
            }
        }
        System.out.println("Youngest friend: " + names[youngIdx]);
        System.out.println("Tallest friend: " + names[tallestIdx]);
    }
}
