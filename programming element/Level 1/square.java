import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter perimeter of the square ");
        double peri = sc.nextDouble();
        double side = peri/4;
        System.out.println("The length of the side is " + side + " whose perimeter is" + peri);
    }
}
