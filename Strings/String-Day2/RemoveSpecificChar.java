import java.util.Scanner;
public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to remove specific characters:");
        String input = scanner.nextLine();
        System.out.println("Enter the character to remove:");
        char charToRemove = scanner.next().charAt(0);
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != charToRemove) {
                result.append(currentChar);
            }
        }
        
        System.out.println("String after removing '" + charToRemove + "': " + result.toString());
        scanner.close();
    }   
    
}
