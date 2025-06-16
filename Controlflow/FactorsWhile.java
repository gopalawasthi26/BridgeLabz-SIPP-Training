import java.util.*;
class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        if (num > 0) {
            while (i < num) {
                if (num % i == 0){
                    System.out.println(i);
                }
                i++;
            }
        }
        else {
            System.out.println("Invalid number");
        }
    }
}