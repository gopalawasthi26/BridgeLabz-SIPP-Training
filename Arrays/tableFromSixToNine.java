import java.util.*;
class TableFromSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int[] mul = new int[4];
        for (int i = 6, j = 0; i <= 9; i++, j++) {
            mul[j] = number * i;
            System.out.println(n + "*" + i + " = " + mul[j]);
        }
    }
}