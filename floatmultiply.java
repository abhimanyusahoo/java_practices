import java.util.Scanner;

public class floatmultiply {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first floating number:");
        float a=sc.nextFloat();
        System.out.println("enter the second floating number:");
        float b=sc.nextFloat();
        float c=a*b;
        // System.out.println("the product of two floating number is:"+c);
        System.out.printf("the multiplication result of two floating numbers %f & %f is :",a,b);
        System.out.printf("%.2f",c);
    }
}
