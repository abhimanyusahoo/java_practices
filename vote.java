import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for vote");
        } else {
            System.out.println("You are not eligible for vote");
        }

        System.out.println("All the best for upcoming election on 2024.");
    }
}
