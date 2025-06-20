import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        int contsonant_count = 0;
        int vowel_ct = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A' || input.charAt(i) == 'e' || input.charAt(i) == 'E' || input.charAt(i) == 'i' || input.charAt(i) == 'I' || input.charAt(i) == 'o' || input.charAt(i) == 'O' || input.charAt(i) == 'u' || input.charAt(i) == 'U') {
                vowel_ct++;
            }
            else {
                contsonant_count++;
            }
        }
        
        System.out.println("Number of vowels in String"  +  vowel_ct);
        System.out.println("Number of consonants in String: " + contsonant_count);
        sc.close();
    }
}