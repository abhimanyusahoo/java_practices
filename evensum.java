import java.util.Scanner;

public class evensum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many even no you want to make sum");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+2*i;
        }
        System.out.println("sum of even no is "+sum);
        sc.close();
    }
}
