import java.util.Scanner;
public class Togglecase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to toggle case:");
        String input = scanner.nextLine();
        StringBuilder toggledString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                toggledString.append(Character.toLowerCase(currentChar));
            } else if (Character.isLowerCase(currentChar)) {
                toggledString.append(Character.toUpperCase(currentChar));
            } else {
                toggledString.append(currentChar); // Non-alphabetic characters remain unchanged
            }
        }

        System.out.println("Toggled case string: " + toggledString.toString());
        scanner.close();
    }
    
}
