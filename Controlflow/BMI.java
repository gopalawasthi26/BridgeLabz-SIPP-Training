import java.util.*;
class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double heightM = h / 100;
        double bmi = w / (heightM * heightM);
        System.out.println( bmi);
    }
}