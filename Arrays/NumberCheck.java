import java.util.*;
class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0){
                System.out.println(arr[i] % 2 == 0 ? "Even" : "Odd");
            }
            else if (arr[i] < 0){
                System.out.println("Negative");
            }
            else
                System.out.println("Zero");
        }
        if (arr[0] == arr[4]){
            System.out.println("First and Last are equal");
        }
        else if (arr[0] > arr[4]){
            System.out.println("First is greater than Last");
        }
        else
            System.out.println("First is less than Last");
    }
}