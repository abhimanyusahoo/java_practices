import java.util.Scanner;;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number to create fibonacci series.");
        int n=sc.nextInt();
        int a=0, b=1, c;

        System.out.print("fibonacci series: " +a+ ", " +b);

        c=a+b;

        while(c<=n){
            System.out.print(", "+c);
            a=b;
            b=c;
            c=a+b;
        }
        sc.close();
    }
}
