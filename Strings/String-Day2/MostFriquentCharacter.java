import java.util.Scanner;
public class MostFriquentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to find the most frequent character:");
        String input = scanner.nextLine();
        
        int[] frequency = new int[256]; // ASCII character set
        for (char c : input.toCharArray()) {
            frequency[c]++;
        }
        
        char mostFrequentChar = input.charAt(0);
        int maxFrequency = frequency[mostFrequentChar];
        
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (frequency[currentChar] > maxFrequency) {
                maxFrequency = frequency[currentChar];
                mostFrequentChar = currentChar;
            }
        }
        
        System.out.println("The most frequent character is: " + mostFrequentChar);
        
        scanner.close();
    }
    
}
