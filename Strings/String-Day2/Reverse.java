import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();
        String revString= "";
        System.out.println("Srtring before reversing: " + input);
        for (int i = input.length() - 1; i >= 0; i--) {
           revString += input.charAt(i);}
        System.out.println("String after reversing: " + revString);
        scanner.close();
    }
}
