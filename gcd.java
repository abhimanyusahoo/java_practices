import java.util.Scanner;

public class gcd {

    public static int gcdfun(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
            }
            return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();

        int result=gcdfun(a,b);
        System.out.println("gcd of "+a+" and "+b+" is "+result);

        sc.close();

    }
}
