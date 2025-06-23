import java.util.*;
class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        int h1 = sc.nextInt();
        int age2 = sc.nextInt();
        int h2 = sc.nextInt();
        int age3 = sc.nextInt();
        int h3 = sc.nextInt();
        int youngest = Math.min(age1, Math.min(age2, age3));
        int tallest = Math.max(h1, Math.max(h2, h3));
        System.out.println("Youngest Age: " + youngest);
        System.out.println("Tallest Height: " + tallest);
    }
}