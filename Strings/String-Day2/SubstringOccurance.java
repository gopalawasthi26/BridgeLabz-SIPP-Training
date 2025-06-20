import java.util.Scanner;
public class SubstringOccurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();
        System.out.println("Enter the substring to find its occurrences:");
        String subString = scanner.nextLine();

        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length(); // Move index forward to avoid counting the same occurrence
        }

        System.out.println("The substring '" + subString + "' occurs " + count + " times in the main string.");
        scanner.close();
    }
    
}
