import java.util.*;
class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] h = new double[11];
        double sum = 0;
        System.out.println("Enter the height of 11 players");
        for (int i = 0; i < 11; i++) {
            h[i] = sc.nextDouble();
            sum += h[i];
        }
        double mean = sum / 11;
        System.out.println("Mean height "+ mean);
    }
}