import java.util.Scanner;

public class threesum {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter the first num");
        int a =num.nextInt();
        System.out.println("enter the second num");
        int b =num.nextInt();
        System.out.println("enter the third num");
        int c =num.nextInt();
        int sum= a+b+c;
        System.out.println("the sum of the three numbers are: "+sum);
    }
}
