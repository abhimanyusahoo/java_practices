import java.util.Scanner;


public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("this program will help you to know that your entered year is a leapyear or not");
        System.out.println("enter the year");
        int year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("this is a leap year");
        }
        else
        {
            System.out.println("this is not a leap year");
        }
        sc.close();
    }
}
