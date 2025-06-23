import java.util.Scanner;
public class Replaceword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        System.out.println("Enter the word to be replaced:");
        String oldWord = scanner.nextLine();
        
        System.out.println("Enter the new word:");
        String newWord = scanner.nextLine();
        
       // create a own method to replace the word
       for (int i = 0; i < input.length(); i++) {
            if (input.startsWith(oldWord, i)) {
                input = input.substring(0, i) + newWord + input.substring(i + oldWord.length());
                i += newWord.length() - 1; // Adjust index to skip over the new word
            }
        }
        System.out.println("Updated string: " + input);

        scanner.close();
    }
}
