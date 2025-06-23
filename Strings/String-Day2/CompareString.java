import java.util.Scanner;
public class CompareString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();
        // Compare the two strings
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not equal: different lengths");
        } else {
            System.out.println("Strings are equal");
        }
        // Check if the strings are equal
        for(int i=0; i<str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                System.out.println("Strings are not equal: different characters at position " + i);
                return; 
            }
        }
        System.out.println("Strings are equal character by character");
  
        scanner.close();
    }
}
