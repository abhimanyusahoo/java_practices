import java.util.Scanner;



public class prime {
    public static void main(String[] args) {
        System.out.println("program to print entered no is prime or not.");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int isPrime;

        if(n>1){
            isPrime=1;

            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    isPrime=0;
                    break;
                }
            }
            if(isPrime ==1){
                System.out.println(n+" is a prime number");

            }else{
                System.out.println(n+" is not a prime number");
            }

        }else{
            System.out.println(n+ "should be greater than 1 to check prime or not.");
        }

        sc.close();
    }
}