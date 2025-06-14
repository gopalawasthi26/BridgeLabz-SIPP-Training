import java.util.Scanner;

public class Discount{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter student fee (INR): ");
        double fee = s.nextDouble();

        System.out.print("Enter discount percent: ");
        double discountPercent = s.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount+" and final discounted fee is INR " +finalFee);
    }
}
