import java.util.*;
public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int cnt = 10;
        double[] salary = new double[cnt];
        int[] yearsOfService = new int[cnt];
        double[] bonus = new double[cnt];
        double[] newSalary = new double[cnt];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < cnt; i++) {
            System.out.println("Enter details for Employee"+ (i + 1));
            System.out.print("Salary");
            double s = sc.nextDouble();
            System.out.print("Years of Service");
            int y = sc.nextInt();
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input");
                i--; 
                continue;
            }
            salary[i] = s;
            yearsOfService[i] = y;
        }
        for (int i = 0; i < cnt; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.printf("Total Bonus Payout: ₹%.2f\n", totalBonus);
        System.out.printf("Total Old Salary: ₹%.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: ₹%.2f\n", totalNewSalary);
    }
}
