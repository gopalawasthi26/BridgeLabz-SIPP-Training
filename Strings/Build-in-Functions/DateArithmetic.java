import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2023, 6, 19); // Example date

        LocalDate resultDate = inputDate.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Original Date: " + inputDate);
        System.out.println("Final Date after operations: " + resultDate);
    }
}
