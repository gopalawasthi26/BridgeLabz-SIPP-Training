import java.util.*;
class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number");
        int n = sc.nextInt();
        if (n <= 0) {
            return;
        }
        int[] odd = new int[n / 2 + 1];
        int[] even = new int[n / 2 + 1];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                even[evenIndex++] = i;
            }
            else
                odd[oddIndex++] = i;
        }
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++){
            System.out.print(odd[i] + " ");
        }
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++){
            System.out.print(even[i] + " ");
        }
    }
}