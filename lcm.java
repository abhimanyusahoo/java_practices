import java.util.Scanner;

public class lcm {

    public static int gcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
            }
            return a;
    }

    public static int lcmfun(int a,int b){
        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();

        int result=lcmfun(a,b);
        System.out.println("LCM of "+a+" and "+b+" is "+result);

        sc.close();

    }
}
