import java.util.Scanner;

public class cylinder {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int h=sc.nextInt();
        int Volume = (int)3.14 * r^2 * h;
        System.out.println(Volume);
    }
}
