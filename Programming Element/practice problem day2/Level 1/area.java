import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double area_CM = 0.5 * base * height;
        double area_IN = area_CM / (2.54 * 2.54); 

        System.out.println("The Area of the triangle in sq in is " + area_IN + " and sq cm is " + area_CM);
    }
}
