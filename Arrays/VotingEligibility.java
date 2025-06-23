import java.util.*;
class VotingEligibility {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int[] age = new int[10];
        System.out.println("Enter the age of 10 students");
        for (int i= 0; i < 10; I++) {
            age[i] = Sc.nextInt();
            if (age[I] < 0){
                System.out.println("Invalid age");
            }
            else if (age[I] >= 18){
                System.out.println("The student with age " + age[I] + " can vote");
            }
            else
                System.out.println("The student with age " + age[I] + "cannot vote");
        }
    }
}