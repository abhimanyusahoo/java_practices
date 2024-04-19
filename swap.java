import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Before swapping the numbers are ");
        System.out.println("a="+a);
        System.out.println("b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping the numbers are ");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
