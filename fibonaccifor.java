import java.util.Scanner;;


public class fibonaccifor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("this program will generate fibonacci series according to the user's choice.");
        System.out.println("enter the first term of fibonacci series.");
        a=sc.nextInt();
        System.out.println("enter the second term of fibonacci Series.");
        b=sc.nextInt();

        System.out.print("fibonacci series: " +a+ ", " +b);

        for(c=a+b;c>=1;c=a+b){
            System.out.print(", "+c);
            a=b;
            b=c;
        }
        sc.close();
    }
}
