import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
        //using recursion
        // System.out.println("Enter the number");
        // int n1=sc.nextInt();
        // System.out.println("Factorial of "+n1+" is "+fact(n1));

        sc.close();

    }
}
