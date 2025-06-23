import java.util.Scanner;
public class BMICalculatorSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n of persons");
        int n = sc.nextInt();
        double[][] data = new double[n][3]; 
        String[] wStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println( (i + 1) );
            double w, h;
            do {
                System.out.print("Enter w");
                w = sc.nextDouble();
            }
            while (w <= 0);
            do {
                System.out.print("Enter h ");
                h = sc.nextDouble();
            } while (h <= 0);

            double bmi = w / (h * h);
            data[i][0] = w;
            data[i][1] = h;
            data[i][2] = bmi;
            if (bmi <= 18.4) {
                wStatus[i] = "Underw";
            }else if (bmi <= 24.9) {
                wStatus[i] = "Normal";
            }
            else if (bmi <= 39.9) {
                wStatus[i] = "Overw";
            } 
            else {
                wStatus[i] = "Obese";
            }
        }
        for (int i = 0; i < n; i++) {
            String h = String.format("%.2f", data[i][1]);
            String w = String.format("%.2f", data[i][0]);
            String bmi = String.format("%.2f", data[i][2]);
            System.out.println(h + "\t\t" + w + "\t\t" + bmi + "\t" + wStatus[i]);
        }
    }
}
