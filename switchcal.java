import java.util.Scanner;

public class switchcal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first num:");
        int a= sc.nextInt();
        System.out.println("enter the second num:");
        int b= sc.nextInt();
        System.out.println("enter the operation you want to execute: \n add for Addition \n sub for Subtraction \n mul for multiplication \n div for division \n ");
        String op= sc.next();


        switch (op){
            case "add":
                System.out.println("addition of the two numbers is " +(a+b));
                break;
            case "sub":
                System.out.println("subtraction of the two numbers is " +(a-b));
                break;
            case "mul":
                System.out.println("multiplication of the two numbers is " +(a*b));
                break;
            case"div":
                System.out.println("division of the two numbers is " +(a/b));
                break;
            default:
                System.out.println("choose the correct keyword");
        }
        sc.close();
    }
}
